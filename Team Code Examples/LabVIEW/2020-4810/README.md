# 2020InfiniteRecharge4810
## Conventions
- For directions in auton, use your right hand (Right Hand Rule): point your thumb, pointer, and middle fingers at right angles to each other. Those are the directions that are positive. 
- For angles, make a thumbs up with your right hand. If you attatched arrows to your fingernails, that's the direction of positive rotation. 
## CAN IDs: 
1. Drive Left Master
2. Drive Left Slave
3. Drive Right Master
4. Drive Right Slave
5. Climber Master - With Climb Forward Limit Switch
6. Climber Slave  - With Climb Reverse Limit Switch
7. Skywalker 
8. Intake
9. Index Conveyer  -  With Pidgeon
10. Index Feeder Wheel
11. Shooter Master
12. Shooter Slave
13. Vanna

## Solenoid IDs
0. Intake Retract
1. Intake Extend
2. 
3. 
4. Vanna Forward
5. Vanna Reverse
6. Shooter Angle Forward, if applicable
7. Shooter Angle Reverse, if applicable

## PWM IDs
0. LEDs

## Joystick Mappings
### Driver Joystick
- Two Joysticks for driving (Left Y is throttle, 
- Right X is turn)
- Triggers for intaking. Pressing all the way forces a retract/extend. Keeping them less than 75% leaves the pheumatic state alone. May make speed on/off, not continuous
- Left bumper: turbo drive
- Right Bumper: auto-align

### Operator Joystick
- DPAD: UP/Down = climber up/down
- DPAD Sideways = Skywalker manual
- Left Bumper = Skywalker auto (gyroscope)
- Y Button: Auto range shooter
- A, B, X buttons: preset speeds shooter
- Right joystick X: Vanna Manual. must have deadband.
- Left Joystick Y: UP = Rotation control; DOWN = position control
Vanna pops up whenever its not disabled
- Right Trigger: Fire Ball (Run indexer)
- Left Trigger: Manual Shooter Speed. Eventually will be Shooter angle.

### Feedback
Driver Rumbles when Vanna done
Operator rumbles when Aligned (only in Teleop)
LEDs white when shooter up to speed
LEDs Blue otherwise
