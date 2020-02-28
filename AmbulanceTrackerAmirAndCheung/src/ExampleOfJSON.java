public class ExampleOfJSON {
    /*{
        "geocoded_waypoints": [
        {
            "geocoder_status": "OK",
                "place_id": "ChIJd8pc6YcjTIYR02X3Yl7rlao",
                "types": [
            "premise"
         ]
        },
        {
            "geocoder_status": "OK",
                "place_id": "ChIJARqrep4kTIYRkMLcwrkbJO0",
                "types": [
            "street_address"
         ]
        }
   ],
        "routes": [
        {
            "bounds": {
            "northeast": {
                "lat": 33.04515370000001,
                        "lng": -96.8327182
            },
            "southwest": {
                "lat": 33.0164363,
                        "lng": -96.842417
            }
        },
            "copyrights": "Map data ©2020",
                "legs": [
            {
                "distance": {
                "text": "2.8 mi",
                        "value": 4453
            },
                "duration": {
                "text": "9 mins",
                        "value": 540
            },
                "end_address": "6124 W Parker Rd, Plano, TX 75093, USA",
                    "end_location": {
                "lat": 33.044411,
                        "lng": -96.83637569999999
            },
                "start_address": "6100 W Plano Pkwy, Plano, TX 75093, USA",
                    "start_location": {
                "lat": 33.0164363,
                        "lng": -96.83335799999999
            },
                "steps": [
                {
                    "distance": {
                    "text": "164 ft",
                            "value": 50
                },
                    "duration": {
                    "text": "1 min",
                            "value": 16
                },
                    "end_location": {
                    "lat": 33.016882,
                            "lng": -96.8333636
                },
                    "html_instructions": "Head <b>north</b> toward <b>W Plano Pkwy</b>",
                        "polyline": {
                    "points": "woohEnw_nQM?c@A[@I?"
                },
                    "start_location": {
                    "lat": 33.0164363,
                            "lng": -96.83335799999999
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "151 ft",
                            "value": 46
                },
                    "duration": {
                    "text": "1 min",
                            "value": 9
                },
                    "end_location": {
                    "lat": 33.0166924,
                            "lng": -96.8330447
                },
                    "html_instructions": "Turn <b>right</b> toward <b>W Plano Pkwy</b>",
                        "maneuver": "turn-right",
                        "polyline": {
                    "points": "orohEnw_nQ?i@@G?C@A@AB?ZE"
                },
                    "start_location": {
                    "lat": 33.016882,
                            "lng": -96.8333636
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "52 ft",
                            "value": 16
                },
                    "duration": {
                    "text": "1 min",
                            "value": 9
                },
                    "end_location": {
                    "lat": 33.0166936,
                            "lng": -96.8328753
                },
                    "html_instructions": "Turn <b>left</b> toward <b>W Plano Pkwy</b>",
                        "maneuver": "turn-left",
                        "polyline": {
                    "points": "iqohEnu_nQ?_@"
                },
                    "start_location": {
                    "lat": 33.0166924,
                            "lng": -96.8330447
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "135 ft",
                            "value": 41
                },
                    "duration": {
                    "text": "1 min",
                            "value": 29
                },
                    "end_location": {
                    "lat": 33.0170492,
                            "lng": -96.8328052
                },
                    "html_instructions": "Turn <b>left</b> toward <b>W Plano Pkwy</b>",
                        "maneuver": "turn-left",
                        "polyline": {
                    "points": "iqohEnt_nQU?K?KCYI"
                },
                    "start_location": {
                    "lat": 33.0166936,
                            "lng": -96.8328753
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "1.4 mi",
                            "value": 2226
                },
                    "duration": {
                    "text": "4 mins",
                            "value": 255
                },
                    "end_location": {
                    "lat": 33.0314297,
                            "lng": -96.842417
                },
                    "html_instructions": "Turn <b>left</b> at the 1st cross street onto <b>W Plano Pkwy</b>",
                        "maneuver": "turn-left",
                        "polyline": {
                    "points": "qsohE`t_nQWQi@fB[x@]p@U^GLKLKLm@l@OLYVML]TULIDOHYJ_@NcAVg@Ha@DE@c@@m@@kB?U@c@?oC?uC@eA?mC?q@?sD?eA?aBKUEUEi@Kw@Oa@Ec@EQ?SAa@A_B?_@?gABW?S@KBYBq@HUDIB[Jg@RC@w@b@_At@EF[Zs@fAS\\GLKVGNO`@U~@ENCPIt@IbAAN?DAb@@`AB`@@^D`@Jp@Fl@?DBd@Bj@@b@Ab@Cf@CRE`@O~@?BUz@Qn@MXOTw@zA"
                },
                    "start_location": {
                    "lat": 33.0170492,
                            "lng": -96.8328052
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "1.1 mi",
                            "value": 1718
                },
                    "duration": {
                    "text": "2 mins",
                            "value": 112
                },
                    "end_location": {
                    "lat": 33.04515370000001,
                            "lng": -96.83935099999999
                },
                    "html_instructions": "Turn <b>right</b> onto <b>Midway Rd</b>",
                        "maneuver": "turn-right",
                        "polyline": {
                    "points": "mmrhEbpanQiAoAIKMOGKU_@i@cA_@_AQi@s@iBUk@]}@Ui@KUc@o@eAaAiAs@_@Oa@Q_AOQAK?cA?}DCgA?kAAuAAkAAyA@gA?c@?i@BY@_AJa@D{@RUD_Bd@wBp@iA^SDqARo@Fo@F]Bu@@gAAgA?uEAeB?"
                },
                    "start_location": {
                    "lat": 33.0314297,
                            "lng": -96.842417
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "0.1 mi",
                            "value": 215
                },
                    "duration": {
                    "text": "1 min",
                            "value": 26
                },
                    "end_location": {
                    "lat": 33.0451413,
                            "lng": -96.8370417
                },
                    "html_instructions": "Turn <b>right</b> onto <b>W Parker Rd</b>",
                        "maneuver": "turn-right",
                        "polyline": {
                    "points": "ecuhE||`nQ?mA@yE?wA?mA"
                },
                    "start_location": {
                    "lat": 33.04515370000001,
                            "lng": -96.83935099999999
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "200 ft",
                            "value": 61
                },
                    "duration": {
                    "text": "1 min",
                            "value": 24
                },
                    "end_location": {
                    "lat": 33.0445916,
                            "lng": -96.83700979999999
                },
                    "html_instructions": "Turn <b>right</b> at the 2nd cross street",
                        "maneuver": "turn-right",
                        "polyline": {
                    "points": "ccuhEnn`nQlBE"
                },
                    "start_location": {
                    "lat": 33.0451413,
                            "lng": -96.8370417
                },
                    "travel_mode": "DRIVING"
                },
                {
                    "distance": {
                    "text": "262 ft",
                            "value": 80
                },
                    "duration": {
                    "text": "1 min",
                            "value": 60
                },
                    "end_location": {
                    "lat": 33.044411,
                            "lng": -96.83637569999999
                },
                    "html_instructions": "Continue straight<div style=\"font-size:0.9em\">Destination will be on the right</div>",
                        "maneuver": "straight",
                        "polyline": {
                    "points": "u_uhEhn`nQPERMJQBK@E@SAOAGCGEIGG"
                },
                    "start_location": {
                    "lat": 33.0445916,
                            "lng": -96.83700979999999
                },
                    "travel_mode": "DRIVING"
                }
               ],
                "traffic_speed_entry": [],
                "via_waypoint": []
            }
         ],
            "overview_polyline": {
            "points": "woohEnw_nQwA?@u@FCZE?_@a@?e@MWQi@fBy@jBU^SZy@z@i@d@k@b@iAh@cBf@iANi@ByC@_JByL?eA?aBKk@KaB[eAKe@AaCAsCDmBVqAd@w@b@_At@a@b@gAdBSd@Wp@[nAMfAKrAAh@DbBF`AR~AHzBEjAIt@ObAg@jB]n@w@zAiAoAW[]k@i@cA_@_AeAsCuAiDc@o@eAaAiAs@_@Oa@Q_AO]AuKEcIAmAByAL}AXuBj@aEpAeBX_BNsADkMC@mMlBEPERMJQDQ?c@EOMQ"
        },
            "summary": "W Plano Pkwy and Midway Rd",
                "warnings": [],
            "waypoint_order": []
        }
   ],
        "status": "OK"
    }
     */
}
