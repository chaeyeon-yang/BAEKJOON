import sys
cnt = int(sys.stdin.readline())

for i in range(cnt):
    ans=sys.stdin.readline().strip()
    stack = []
    vps=True
    for j in (ans):
        if j =='(':
            stack.append(j)
        else:
            if not stack or stack[-1]!='(':
                vps=False
                break
            else:
                stack.pop()
    if vps and not stack:
        print('YES')
    else:
        print('NO')
