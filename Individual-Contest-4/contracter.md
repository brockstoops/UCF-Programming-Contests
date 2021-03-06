# Programming Contractor 
##                  Filename: *contractor*

## The Problem
```
After graduating from UCF with your Computer Science degree, you’ve decided that you’d like
to work for yourself, instead of some big corporation. In starting your business, you find 
that various companies want to outsource jobs that you can do. For each job, you’ve become 
very good at determining the number of days it will take you to finish it. Naturally, each 
of these jobs comes with a fixed amount of compensation, regardless of how long the work takes.
Due to your superior education, you may receive more offers for jobs than you can take. Given 
the number of days you are willing to work in the year, write a program to determine the maximal
amount of money you can make if you accept the appropriate set of jobs.
```

## The Input
```
The first line of the input file will contain a single positive integer, c (c ≤ 1000), 
representing the number of input cases to analyze. The first line of each input case will
have two space separated positive integers, n (n ≤ 20), and d (d ≤ 365), representing the 
number of job offers you’ve received for the year and the number of days you are willing to 
work during the year, respectively.  The next n lines will each contain two space separated 
integers, di (di ≤ 365) and  pi(pi ≤ 1000000), representing the number of days and amount of
payment, respectively, you would receive if you accepted the ith job. The OutputFor each input
case, output a single integer representing the maximal amount of money in dollars you can make
by taking a set of the possible jobs that you can finish within the number of days given (or fewer days).
```

## Sample Input

2

2 5 

3 10000 

4 8000 

3 100 

20 20000 

40 50000 

40 30000

## Sample Output

10000 

100000
     
