def add(a,b):
    return a+b

def subtract(a,b):
    return a-b

def multiply(a,b):
    return a*b

def divide(a,b):
    return a/b

a=float(input("Enter first number:"))
b=float(input("Enter second number:"))

add_result=add(a,b)
subtract_result=subtract(a,b)
multiply_result=multiply(a,b)

print("add=",add_result)
print("subtract=",subtract_result)
print("multiply=",multiply_result)

if b==0:
    print("divide=cannot divide by zero")
else:
    divide_result=divide(a,b)
    print("divide=",divide_result)