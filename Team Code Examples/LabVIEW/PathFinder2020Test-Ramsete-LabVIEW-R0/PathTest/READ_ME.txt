This is a modified sample tank/arcade drive test program for using the 
PathFinder library, available at:

	https://github.com/JacisNonsense/Pathfinder

The sample programs:
 
 -- creates paths given defined points along the way.
    The path is an array of left and right speed setpoints.
    The array also contains expected left and right distance
    and heading (gyro) values.

 -- executes these paths.  This execution occurs on one of two
    targets, PC simulated robot, NI roboRIO.

 -- The sample program has crude optional PID based gyro compensation.

There are two versions of the sample.  They are both located in the
"test Programs" directory.  One uses a simple index
to sequentially execute the path steps, without regard to whether
the execution loop is losing time.  The other calculates the
actual time offset since the start of the path to index into the
path steps.

The LabView Pathfinder library is used.  This library has a couple
of changes. 1) Remove the use of external strings to find the Windows
DLL file. 2) Additon of several typedefs for the path that the
robot executes. 3) The pathfinder DLL LIB and SO files are included
in the library project.  The DLL file may need to be copied to:
c:\program files\national instruments\labview 20xx\resource  

This sample includes the 2/19/2019 version of the DLL files.

As of 2020 there are a number of sample / test programs.  They are in the "test programs"
self populating folder.
-- path test 2020 tank robot scan index-create file
	this will create a text file of a path that can be read and executed by the robot.
	(the simulated robot is diabled for this program..  It could be re-enabled and
	updated if desired.)
-- path test 2020 tank robot ramsete scanindex createfile
	this will create a text for for either a non-ramsete controller execution, 
	or a separate file for ramsete controller execution.  It will also simulate
	the execution of the ramsete robot on the PC.
-- the other samples are from 2019...

NOTE: The PahtExecution library is an implementation of the FRC java/c++ ramsete 
code that of the FRC java / c++ implementation.
(The copyright is included in the help of the ramsete vi...  Regardless, this code
is only for use by FRC teams.

NOTE: Consider the ramsete implementation to be alpha code.  It hasn't been fully tested.
It has never been tested on a real robot.  If you find errors or make fixes, please let
everyone know.










