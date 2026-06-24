try:
    number=input("请输入一个整数")
    number=int(number)
    if number>0:
        print("正数")
    elif number<0:
        print("负数")
    else:
        print("0")
except ValueError:
    print("请输入整数")