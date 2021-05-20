def find_max(string):
    max = ''
    for i in range(0, len(string)):
        if max <= string[i]:
            max = string[i]

    return max

def delete_element(string, element):
    for i in range(0, len(string)):
        if string[i] == element:
            string = string.replace(string[i], "", 1)
            break
    return string

def reverse(string):
    reverseStr = ''
    for i in string:
        reverseStr = i + reverseStr

    return print(reverseStr)

def find_numbers(string, empty_list):
    scratch = ''
    for i in range(0, len(string)):
        if string[i].isdigit() == True:
            scratch = scratch + b[i]
            if i == len(string) - 1:
                empty_list.append(int(scratch))
        if string[i].isdigit() == False:
            if scratch != '':
                empty_list.append(int(scratch))
                scratch = ''

    numbers = empty_list
    return

a = 'GiVeMe198Choco!@$#'
t = ''

for i in range(len(a)):
    tt = find_max(a)
    a = delete_element(a, tt)
    t = tt + t
    print(a)
    print(t)
    print()

reverse(t)

b = 'a123ba23aca343zz8'
numbers = []
find_numbers(b, numbers)
print(numbers)