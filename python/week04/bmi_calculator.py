def calculate_bmi(weight, height):
    return weight / (height * height)


weight = float(input("Enter weight kg: "))
height = float(input("Enter height m: "))

bmi = calculate_bmi(weight, height)

print("BMI =", bmi)