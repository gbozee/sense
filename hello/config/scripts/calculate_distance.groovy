def distance(first_lat1, first_lng1, second_lat_1, second_lat_2){
    lat1 = toRadians(degrees=first_lat1);
    lng1 = totoRadians(degrees=first_lng1);
    lat2 = toRadians(degrees=second_lat_1);
    lng2 = toRadians(degrees=second_lat_2);

    sin_lat1 = sin(lat1);
    cos_lat1 = cos(lat1);
    sin_lat2 = sin(lat2);
    cos_lat2 = cos(lat2);

    delta_lng = lng2 - lng1;
    cos_delta_lng = cos(delta_lng);
    sin_delta_lng =  sin(delta_lng);

    d = atan2(sqrt((cos_lat2 * sin_delta_lng) ** 2 +
                   (cos_lat1 * sin_lat2 -
                    sin_lat1 * cos_lat2 * cos_delta_lng) ** 2),
              sin_lat1 * sin_lat2 + cos_lat1 * cos_lat2 * cos_delta_lng);

    return 6372.795 * d;
}

distance(Double.parseDouble(_source.user.location.coordinate.lat), Double.parseDouble(_source.user.location.coordinate.lon),
  lat,lon)

  def distance(first_lat1, first_lng1, second_lat_1, second_lat_2){
      lat1 = toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat));
      lng1 = toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon));
      lat2 = toRadians(degrees=lat);
      lng2 = toRadians(degrees=lon);

      sin_lat1 = sin(toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat)));
      cos_lat1 = cos(ltoRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat)));
      sin_lat2 = sin(toRadians(degrees=lat));
      cos_lat2 = cos(toRadians(degrees=lat));

      delta_lng = toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon));
      cos_delta_lng = cos(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon)));
      sin_delta_lng =  sin(toRadians(degrees=lon) - totoRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon)));

      d = atan2(sqrt((cos(toRadians(degrees=lat)) * sin(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon)))) ** 2 +
                     (cos(ltoRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * sin(toRadians(degrees=lat)) -
                      sin(toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * cos(toRadians(degrees=lat)) * cos(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon)))) ** 2),
                sin(toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * sin(toRadians(degrees=lat)) + cos(ltoRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * cos(toRadians(degrees=lat)) * cos(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon))));

      return
      6372.795 * atan2(sqrt((cos(toRadians(degrees=lat)) * sin(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon)))) ** 2 + (cos(ltoRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * sin(toRadians(degrees=lat)) - sin(toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * cos(toRadians(degrees=lat)) * cos(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon)))) ** 2), sin(toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * sin(toRadians(degrees=lat)) + cos(toRadians(degrees=Double.parseDouble(_source.user.location.coordinate.lat))) * cos(toRadians(degrees=lat)) * cos(toRadians(degrees=lon) - toRadians(degrees= Double.parseDouble(_source.user.location.coordinate.lon))));
     }
