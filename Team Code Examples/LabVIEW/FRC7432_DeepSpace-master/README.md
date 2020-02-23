# Team 7432 NOS
2019 FRC Comp Bot Code

FRC Team 7432 NOS LabVIEW code for the 2019 Season

## Functions
### Command and Control LabVIEW  <br />
### Autonomous
- Motion Profiling Drive
- SRX processed points timing for manipulators in auto
- Capability of loading new paths on the fly and not changing code
- Can change paths match by match to accommodate alliance
- Automatically combine paths at match start to not change code
- Automatically reverse Auto paths for driving backwards
- Paths get displayed on dashboard for driver to see robot position
### Drive Train 
- Field Centric Mecanum 4ft/sec <br />
- Robot Centric Mecanum 4ft/sec <br />
-  Field Centric Mecanum 14ft/sec <br />
-  Robot Centric Mecanum 14ft/sec <br />
-  Robot Centric 6 Wheel Tank 4ft/sec <br />
-  Robot Centric 6 Wheel Tank 14ft/sec <br />
-  Turn to angle (NavX) <br />
-  Strafe Correction (NavX) <br />
-  Auto Balancing <br />
-  Auto shifting 2 speed gearboxes <br />
-  Drive to distance <br />
-  Ball Centric<br />
-  Rocket Centric<br />
-  Cargo Ship Centric<br />
-  Pursuit Mode (Tracking other robots to play defense)<br />
### Arduino LED Lights
- Led Lights indicating drive mode <br />
- Driven by DIO converted from binary used in switch statement <br />
### Vision Tracking
- TCP/IP connection to UP^2 Development board <br />
- API calls communicating to RoboRealm vision tracking software <br />
- Displays Eagle Eye view to dashboard (newer car overhead display) <br />
- Vision Tracking Ball <br />
- Vision Tracking Tape <br />
- Vision Tracking opposing robots <br />
### Dash Board
- Dual Screen Dashboard (1 for Driver, 1 for Manipulator)
- LimeLite X/Y to graph to reduce Bandwidth
- Elevator setpoint and real time position graphed for manipulator
- Match Timer for driver
- Picture of auto path for driver to verify
