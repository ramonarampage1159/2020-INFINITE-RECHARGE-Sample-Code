<?xml version='1.0' encoding='UTF-8'?>
<Library LVVersion="18008000">
	<Property Name="NI.Lib.Icon" Type="Bin">'!#!!!!!!!)!"1!&amp;!!!-!%!!!@````]!!!!"!!%!!!(]!!!*Q(C=\&gt;7R=2MR%!81N=?"5X&lt;A91P&lt;!FNA#^M#5Y6M96NA"R[WM#WQ"&lt;9A0ZYR'E?G!WPM1$AN&gt;@S(!ZZQG&amp;0%VLZ'@)H8:_X\&lt;^P(^7@8H\4Y;"`NX\;8JZPUX@@MJXC]C.3I6K5S(F/^DHTE)R`ZS%@?]J;XP/5N&lt;XH*3V\SEJ?]Z#F0?=J4HP+5&lt;Y=]Z#%0/&gt;+9@%QU"BU$D-YI-4[':XC':XB]D?%:HO%:HO(2*9:H?):H?)&lt;(&lt;4%]QT-]QT-]BNIEMRVSHO%R@$20]T20]T30+;.Z'K".VA:OAW"%O^B/GK&gt;ZGM&gt;J.%`T.%`T.)`,U4T.UTT.UTROW6;F.]XDE0-9*IKH?)KH?)L(U&amp;%]R6-]R6-]JIPC+:[#+"/7Q2'CX&amp;1[F#`&amp;5TR_2@%54`%54`'YN$WBWF&lt;GI8E==J\E3:\E3:\E-51E4`)E4`)EDW%D?:)H?:)H?5Q6S:-]S:-A;6,42RIMX:A[J3"Z`'S\*&lt;?HV*MENS.C&lt;&gt;Z9GT,7:IOVC7*NDFA00&gt;&lt;$D0719CV_L%7.N6CR&amp;C(7(R=,(1M4;Z*9.T][RNXH46X62:X632X61?X6\H(L8_ZYP^`D&gt;LP&amp;^8K.S_53Z`-Z4K&gt;4()`(/"Q/M&gt;`P9\@&lt;P&lt;U'PDH?8AA`XUMPTP_EXOF`[8`Q&lt;IT0]?OYVOA(5/(_Z!!!!!!</Property>
	<Property Name="NI.Lib.SourceVersion" Type="Int">402685952</Property>
	<Property Name="NI.Lib.Version" Type="Str">1.0.0.0</Property>
	<Property Name="NI.LV.All.SourceOnly" Type="Bool">false</Property>
	<Item Name="Private" Type="Folder">
		<Property Name="NI.LibItem.Scope" Type="Int">2</Property>
		<Item Name="Calculate Curvature.vi" Type="VI" URL="../Private/Calculate Curvature.vi"/>
		<Item Name="Distance Formula.vi" Type="VI" URL="../Private/Distance Formula.vi"/>
		<Item Name="Extrapolate Path Ending.vi" Type="VI" URL="../Private/Extrapolate Path Ending.vi"/>
		<Item Name="Get closest point on path.vi" Type="VI" URL="../Private/Get closest point on path.vi"/>
		<Item Name="Get target point on path.vi" Type="VI" URL="../Private/Get target point on path.vi"/>
		<Item Name="Path AE.vi" Type="VI" URL="../Private/Path AE.vi"/>
		<Item Name="Process Path.vi" Type="VI" URL="../Private/Process Path.vi"/>
		<Item Name="Pure Pursuit Velocity FF.vi" Type="VI" URL="../Private/Pure Pursuit Velocity FF.vi"/>
		<Item Name="Robot Velocity to LR.vi" Type="VI" URL="../Private/Robot Velocity to LR.vi"/>
		<Item Name="To robot frame.vi" Type="VI" URL="../Private/To robot frame.vi"/>
	</Item>
	<Item Name="Public" Type="Folder">
		<Item Name="Pure Pursuit Initialize.vi" Type="VI" URL="../Public/Pure Pursuit Initialize.vi"/>
		<Item Name="Pure Pursuit.vi" Type="VI" URL="../Public/Pure Pursuit.vi"/>
	</Item>
	<Item Name="RobotSimulator.vi" Type="Folder">
		<Item Name="motorTorque.vi" Type="VI" URL="../RobotSimulator.vi/motorTorque.vi"/>
		<Item Name="Robot.vi" Type="VI" URL="../RobotSimulator.vi/Robot.vi"/>
		<Item Name="robotFriction.vi" Type="VI" URL="../RobotSimulator.vi/robotFriction.vi"/>
		<Item Name="robotSimulation.vi" Type="VI" URL="../RobotSimulator.vi/robotSimulation.vi"/>
	</Item>
	<Item Name="Typedef" Type="Folder">
		<Item Name="Odometry.ctl" Type="VI" URL="../Typedef/Odometry.ctl"/>
		<Item Name="Path AE Action.ctl" Type="VI" URL="../Typedef/Path AE Action.ctl"/>
		<Item Name="Path Point.ctl" Type="VI" URL="../Typedef/Path Point.ctl"/>
		<Item Name="Pure Pursuit Telemetry.ctl" Type="VI" URL="../Typedef/Pure Pursuit Telemetry.ctl"/>
	</Item>
	<Item Name="Visualization" Type="Folder">
		<Item Name="Current Path.vi" Type="VI" URL="../Visualization/Current Path.vi"/>
		<Item Name="Draw Circle.vi" Type="VI" URL="../Visualization/Draw Circle.vi"/>
		<Item Name="Draw Robot Active Curve.vi" Type="VI" URL="../Visualization/Draw Robot Active Curve.vi"/>
		<Item Name="Plot Robot.vi" Type="VI" URL="../Visualization/Plot Robot.vi"/>
		<Item Name="Set Current Path for Visualization.vi" Type="VI" URL="../Visualization/Set Current Path for Visualization.vi"/>
	</Item>
	<Item Name="Pure Pursuit" Type="Variable">
		<Property Name="featurePacks" Type="Str">Global,Real-Time Features</Property>
		<Property Name="Global:EnableTimestamp" Type="Str">False</Property>
		<Property Name="Industrial:IsNetworkPublished" Type="Str">True</Property>
		<Property Name="Network:UseBinding" Type="Str">False</Property>
		<Property Name="Network:UseBuffering" Type="Str">False</Property>
		<Property Name="numTypedefs" Type="UInt">2</Property>
		<Property Name="Real-Time Features:ApplyNetworkConfig" Type="Str">False</Property>
		<Property Name="Real-Time Features:BufferLength" Type="Str">1</Property>
		<Property Name="Real-Time Features:UseBuffering" Type="Str">False</Property>
		<Property Name="type" Type="Str">Global</Property>
		<Property Name="typedefName1" Type="Str">Pure Pursuit.lvlib:Path Point.ctl</Property>
		<Property Name="typedefName2" Type="Str">Pure Pursuit.lvlib:Pure Pursuit Telemetry.ctl</Property>
		<Property Name="typedefPath1" Type="PathRel">../Typedef/Path Point.ctl</Property>
		<Property Name="typedefPath2" Type="PathRel">../Typedef/Pure Pursuit Telemetry.ctl</Property>
		<Property Name="typeDesc" Type="Bin">'!#!!!!!!!)!"1!&amp;!!!-!%!!!@````]!!!!"!!%!!!(?WA%!!"A!A!!!!!!,!!&gt;!#A!"?!!(1!I!!8E!$5!+!!&gt;I:7&amp;E;7ZH!!^!#A!*9X6S&gt;G&amp;U&gt;8*F!"6!#A!/&gt;'^U97QA:'FT&gt;'&amp;O9W5!!"&gt;!#A!2&gt;G6M&lt;W.J&gt;(EA:8BQ:7.U:71!4A$R!!!!!!!!!!)35(6S:3"1&gt;8*T&gt;7FU,GRW&lt;'FC$F"B&gt;'AA5'^J&lt;H1O9X2M!#2!5!!'!!!!!1!#!!-!"!!&amp;$&amp;2B=G&gt;F&gt;#"1&lt;WFO&gt;!!!4!$R!!!!!!!!!!)35(6S:3"1&gt;8*T&gt;7FU,GRW&lt;'FC$F"B&gt;'AA5'^J&lt;H1O9X2M!#*!5!!'!!!!!1!#!!-!"!!&amp;#U.M&lt;X.F)&amp;"P;7ZU!!^!#A!*1X6S&gt;G&amp;U&gt;8*F!!^!!Q!*;7ZE:8AA&lt;X6U!&amp;!!]1!!!!!!!!!#%F"V=G5A5(6S=X6J&gt;#ZM&gt;GRJ9BJ1&gt;8*F)&amp;"V=H.V;81A6'6M:7VF&gt;(*Z,G.U&lt;!!;1&amp;!!"!!'!!=!#!!*"U.M&gt;8.U:8)!!1!+!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!</Property>
	</Item>
</Library>
