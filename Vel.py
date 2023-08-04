import math

while True:
  print("Enter 'x' to exit.")
  num = input("Enter a number: ")

  if num == "x":
    break

  try:
    number = float(num)
  except ValueError:
    print("Invalid input. Please enter a number.")
    continue

  number_sqrt = math.sqrt(number)
  print("Square root of {} is {:.3f}".format(number, number_sqrt))
