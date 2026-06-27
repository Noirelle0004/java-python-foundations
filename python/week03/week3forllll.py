scores=[88,59,76,92,45,100,67]
total=0
passcount=0
failcount=0

for score in scores:
    total=total+score
    if score>=60:
        passcount=passcount+1
    else:
        failcount=failcount+1

average=total/len(scores)

print("total=",total)
print("average=",average)
print("pass=",passcount)
print("fail=",failcount)
print("max=",max(scores))
print("min=",min(scores))