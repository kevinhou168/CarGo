import smartcar

access_token = 'cfc0ed4e-2aa6-4687-a5c5-2d3df2a93fb0'

response = smartcar.get_vehicle_ids(access_token)

vid = response['vehicles'][0]

vehicle = smartcar.Vehicle(vid, access_token)

location = vehicle.location()

print(location)
