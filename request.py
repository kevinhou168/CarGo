import smartcar

access_token = '742b2bbf-a04d-4ccc-94cd-3a78e81de3a8'

response = smartcar.get_vehicle_ids(access_token)

vid = response['vehicles'][0]

vehicle = smartcar.Vehicle(vid, access_token)

location = vehicle.location()

print(location)
