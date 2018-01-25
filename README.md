# AlarmTimerApp
Initial app version

“Alarm-Timer” ia an Android app which allows to set an alarm and a countdown timer.

Main Activity starts other activities with implicit intents.
The layout for the main activity contains three buttons, labeled:
 Timer
 Alarm

Timer Activity
In the main activity when you click on the Timer button, start another activity with an explicit intent. 
This activity is a countdown timer. Call this activity, TimerActivity.
The corresponding layout for TimerActivity provides EditText widgets, and a button.
The first EditText widget is used to enter a duration value. The duration value specifies the number of seconds to count down.
Place another EditText widget underneath the duration EditText widget for entering a message.
Locate a button underneath the message EditText widget, and label it "Set Timer". When this button is clicked on, 
send an implicit intent to whatever it is on an Android device that can handle the ACTION_SET_TIMER action.

Include extras on the intent that specify:

 a message
 duration in seconds
 skip the user interface and just start the timer

When you dismiss the timer, make sure your app returns to the Timer Activity.

Alarm Activity
In the main activity, when you click on the Alarm button, start another activity with an explicit intent. 
This activity will set an alarm. Call this activity, AlarmActivity.
The corresponding layout for AlarmActivity is to provide two EditText widgets arranged vertically for entering a numeric value for hour, 
and a numeric value for entering minutes.
Position a button beneath the EditText widgets, and label it "Set Alarm". When the button is clicked on, send an implicit intent 
to whatever it is on an Android device that can handle the ACTION_SET_ALARM action. Include extras on the intent that specify the 
hour and minutes of the alarm, and the message.
When you dismiss the timer, make sure your app returns to the Alarm Activity.
