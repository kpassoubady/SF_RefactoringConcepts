#Business background
The Kangs family has a movie rental shop that has been open for ten years
The boss saw the recent rapid development of the Internet, and suddenly had an idea to be an online rental store

The shop had a system that used it for ten years, and was developed by the boss in his spare time.

There is a method statement under the class Customer, used to print the guest's rental ticket

Rental Record for Jerry<br>
&nbsp;&nbsp;&nbsp;&nbsp;Titanic	1.5<br>
Amount owed is 1.5<br>
You earned 1 frequent renter points<br>

Please add a new method htmlStatement in the class Customer, so that the system can print out the details of the rental ticket in html format.
such as:
```
<H1>Rentals for <EM>Jerry</EM></H1><P>
Roman Holiday: 3.0<BR>
Titanic: 3.0<BR>
<P>You owe<EM>6.0</EM><P>
On this rental you earned <EM>2</EM> frequent renter points<P>
```
Steps:
1. Refactor the Statement method in Customer
2. Add tests to existing code before refactoring
3. Submit in small steps, each time explaining the motivation and technique

#Advanced
If you have completed the task of printing the small ticket in html format, please complete the following requirements again <br>
The boss found more and more literary and artistic films recently, and bought a large number of literary and artistic films. <br>
Please add the type of literary and artistic films to the code. Renting a literary and artistic film costs ￥ 6, but points can be increased by 1.5 points