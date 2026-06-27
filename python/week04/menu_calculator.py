def add(a, b):
    return a + b


def subtract(a, b):
    return a - b


def multiply(a, b):
    return a * b


def divide(a, b):
    return a / b


print("1. add")
print("2. subtract")
print("3. multiply")
print("4. divide")

choice = input("Enter your choice: ")

a = float(input("Enter first number: "))
b = float(input("Enter second number: "))

if choice == "1":
    result = add(a, b)
    print("result =", result)

elif choice == "2":
    result = subtract(a, b)
    print("result =", result)

elif choice == "3":
    result = multiply(a, b)
    print("result =", result)

elif choice == "4":
    if b == 0:
        print("divide = cannot divide by zero")
    else:
        result = divide(a, b)
        print("result =", result)

else:
    print("Invalid choice")