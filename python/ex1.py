def main():
    counter = 0
    st = input("enter new string: ")
    while len(st) > 4:
        if "T" in st:
            counter += 1
        st = input("enter new string: ")
    print(f"T appears {counter} times")


if __name__ == '__main__':
    main()
