while True:
    age=input("请输入年龄:")
    
    try:
        age=int(age)
        if age>=18:
         print("成年")
        else:
         print("未成年")
        break
     
    except ValueError:
        print("请输入整数，请重新输入：")
    