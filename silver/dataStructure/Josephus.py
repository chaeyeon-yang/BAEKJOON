import sys
n,t=map(int, sys.stdin.readline().split())
li=[i for i in range(1,n+1)]

ans=[]
num=0

for i in range(n):
    num+=t-1
    if num>=len(li):
        num=num%len(li)
    ans.append(str(li.pop(num)))

print("<"+", ".join(ans)[:]+">")