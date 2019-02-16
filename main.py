import smartcar
from flask import Flask, redirect, request, jsonify
from flask_cors import CORS

import os

app = Flask(__name__)
CORS(app)

# global variable to save our access_token
access = None

# TODO: Authorization Step 1a: Launch Smartcar authorization dialog
client = smartcar.AuthClient(
    client_id=os.environ.get('CLIENT_ID'),
    client_secret=os.environ.get('CLIENT_SECRET'),
    redirect_uri=os.environ.get('REDIRECT_URI'),
    scope=['read_vehicle_info', 'read_location', 'control_security'],
    test_mode=False,
)

@app.route('/login', methods=['GET'])
def login():
    # TODO: Authorization Step 1b: Launch Smartcar authorization dialog
    auth_url = client.get_auth_url()
    return redirect(auth_url)
    pass


@app.route('/exchange', methods=['GET'])
def exchange():
    # TODO: Authorization Step 3: Handle Smartcar response
    code = request.args.get('code')
    

    # TODO: Request Step 1: Obtain an access token
    global access
    access = client.exchange_code(code)
    print(access)
    return '', 200

@app.route('/vehicle', methods=['GET'])
def vehicle():
    # TODO: Request Step 2: Get vehicle ids
    global access
    vehicle_ids = smartcar.get_vehicle_ids(
        access['access_token'])['vehicles']
    # TODO: Request Step 3: Create a vehicle
    vehicle = smartcar.Vehicle(vehicle_ids[0], access['access_token'])
    # TODO: Request Step 4: Make a request to Smartcar API
    info = vehicle.info()
    print(info)
    '''
    {
        "id": "36ab27d0-fd9d-4455-823a-ce30af709ffc",
        "make": "TESLA",
        "model": "Model S",
        "year": 2014
    }
    '''
    return jsonify(info)

if __name__ == '__main__':
    app.run(port=8000)
