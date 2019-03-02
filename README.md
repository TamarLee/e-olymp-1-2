# e-olymp-1-2

# Tourist
John is going to a tourist meeting of pupils in his school. In his class he was made responsible for the tents. At home he found 3 tents: the first one weighs a1 kilograms and accommodates b1 people, the second tent weighs a2 kilograms and accommodates b2 people, the third tent weighs a3 kilograms and accommodates b3 people.

There are k pupils in John's class. Find out if John can choose tents such that all people can fit in them. Take into account that the selected tents should weigh no more than w kilograms in total.

Input
The first line contains two integers k and w (1 ≤ k ≤ 15, 1 ≤ w ≤ 30). The second line contains six integers: a1, b1, a2, b2, a3, b3 (1 ≤ a1, a2, a3 ≤ 10, 1 ≤ b1, b2, b3 ≤ 15).

Output
Print YES if it is possible to choose tents as desired, and NO otherwise.

# Exchange
On Christmas, in the evening, there were three flowers in the window, from left to right: geranium, crocus and violet. Every morning Masha cleans the dust and changes position of the right flower with central one. In the afternoon, Tanya waters the flowers and swaps left and central flowers. Print the order of the flowers after k days, at night.

Input
The first line contains a number of test cases t (1 ≤ t ≤ 12). Each of the following t lines contains the number of days k (1 ≤ k ≤ 1000).

Output
Print for each test case in a separate line three Latin letters "G", "C" and "V" (capital letters, no spaces) representing the order of flowers in k days (from left to right). Here G stands for geranium, C for crocus and V for violet.

# The level of educational achievements
Determine the level of educational achievements for the pupil (elementary, average, sufficient, high) according to the given grade (from 1 to 12).

Input
One number that is a grade for the pupil.

Output
Print Initial for elementary level (grade from 1 to 3), Average for average level (grade from 4 to 6), Sufficient for sufficient level (grade from 7 to 9) and High for high level (grade from 10 to 12).


# First or last?
Three digit number is given. What digit is bigger: the first digit or the last digit?

Input
One three digit number.

Output
Print the bigger digit between first and last. In case of equality, print "=" (without quotes).

# Season
Determine the season name by the month number using the compound conditions.

Input

The number of the month.

Output

For spring months print Spring, for summer - Summer, for autumn - Autumn and for winter - Winter.


# Wardrobe
The dimensions of the wardrobe are a × b × c. Is it possible to carry it through the doorway of the size x × y? The wardrobe can be carried through the doorway, if its corresponding dimensions are not greater than the dimensions of the door.

Input
Integer numbers a, b, c, x, y (1 ≤ a, b, c, x, y ≤ 100).

Output
Print "YES", if its possible to carry the wardrobe, and "NO" otherwise.


# Even and odd numbers
Given three integers a, b, c. Determine is there among them exist at least one even and at least one odd number.

Input
The numbers a, b, c, not exceeding 10000 by absolute value (numbers can be negative).

Output
Print "YES" or "NO".


# IP-address
In order toaccess the Internet,eachcomputer is assigned aso-calledIP-address.It consistsof four integersin the rangefrom 0 to 255separated by dots.The next threelines show threevalidIP-address:

127.0.0.0

192.168.0.01

255.00.255.255

Write a program thatdetermineswhether a givenstring is a validIP-address.

Input

The input tothe programserveda stringno longer than15 characters,which includesfiguresandexactly threepoints.

Output

If the stringis a validIP-address, you mustwithdraw1,0 otherwise.


# Sum of odd numbers
Find the sum of odd numbers in the range from а to b.

Input
Two integers a and b, not greater than 109 by absolute value.

Output
Print the sum of odd numbers in the range from а to b.


# New Sergey's game
C-student Sergey often asks A-student Vasya to do his homework. Vasya is genius, but he still cann't cope with the work instantly, so Sergey waits. Sergey is boring long because of nothing to do. Not so long ago he came up with a new game to pass the time.

On the white table with coordinate system Sergey puts a rectangular sheet of black paper. Above it he puts a rectangular piece of white paper so that possible it overlaps a portion of the black sheet. The parties of both sheets of paper are parallel to the coordinate axes. After that, the boy chooses a point on the plane of the table. If it hits the black sheet, Serge believes that the expectations are not boring, otherwise he gets upset.

Help Sergey to understand, is he upset or not.

Input
First given the coordinates of upper left corner of black rectangle, then bottom right, the the coordinates of angles of white rectangle in the same format and at last the point's coordinates are given. All coordinates are integer, not greater than 10000 by absolute value.

Output
Print "SAD" if Sergey is sad (if the point falls on the boundary, Sergey thinks it belongs to the black sheet), and "HAPPY" otherwise.
