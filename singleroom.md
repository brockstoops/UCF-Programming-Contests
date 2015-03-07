# SingleRoom

## Single Room Scheduling
```
Your goal is to implement an algorithm for scheduling the maximal number of 
requests for a single room given the start and end times of all the requests.
Thus, in this schedule, you potentially reject certain events, but schedule 
as many as possible that will fit in the room. Assume that it is permissible 
to schedule an event with another event that starts at that exact same time 
as the other ends. Your output for each case should follow the following format. 
```
Test case n: A maximum of k events can be scheduled.
```
where n is the input case number (1, 2, etc.), and k is the maximum number of 
events that can be scheduled in the room. Each line of output should correspond
to one input case.
```
## File Format
```
The first line will contain a single integer, n, the number of input cases in the
file. The first line of each input case will contain a single integer, k <= 1000,
the number of events to be scheduled potentially for that input case. The following
k lines of the input case will contain two positive integers each, s, and f, with 
s < f <= 2000, where s represents the start time and f represents the finish time.
Here is an example file:
```
```
2 
5 
10 20 
15 25 
20 27 
28 35 
9 15 
1
3 12
```
For this file, the output should be:
```
Test case 1: A maximum of 3 events can be scheduled. 
Test case 2: A maximum of 1 events can be scheduled.
```
     
