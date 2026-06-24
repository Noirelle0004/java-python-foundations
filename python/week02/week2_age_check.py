
try:
 age=input("请输入年龄：")
 age=int(age)
 if age>=18:
    print("成年")
 else:
    print("未成年")
except ValueError:
    print("请输入整数")
