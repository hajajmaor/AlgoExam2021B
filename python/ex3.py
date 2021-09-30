def print_substring(s: str, ch: str) -> None:
    index = s.find(ch)
    while index > -1:
        print(s[index:])
        index = s.find(ch, index+1)


def main():
    print_substring("miaom", "m")


if __name__ == '__main__':
    main()
