from enum import Enum
from typing import List


class NecklaceType(Enum):
    Uniq = 1
    Boring = 2
    Regular = 3
    Perfect = 4


class Necklace:
    green: int
    red: int
    yellow: int

    def __init__(self, green: int, red: int, yellow: int) -> None:
        self.green = green
        self.red = red
        self.yellow = yellow

    def getNecklaceType(self) -> NecklaceType:
        if (self.green != 0 and self.yellow == 0 and self.red == 0 or self.green == 0 and self.yellow == 0 and self.red != 0
                or self.green == 0 and self.yellow != 0 and self.red == 0):
            return NecklaceType.Uniq
        elif (self.green == self.yellow and self.yellow == self.red):
            return NecklaceType.Perfect
        elif (self.green != 0 and self.yellow != 0 and self.red == 0
              or self.green == 0 and self.yellow != 0 and self.red != 0
              or self.green != 0 and self.yellow == 0 and self.red != 0):
            return NecklaceType.Boring
        else:
            return NecklaceType.Regular

    def __len__(self):
        return self.green+self.red+self.yellow


def how_many_boring_necklaces(necklaces: List[Necklace], num: int) -> int:
    counter = 0
    for nck in necklaces:
        if (nck.getLength() > num and nck.getNecklaceType() == NecklaceType.Boring):
            counter += 1
    return counter


def main():
    pass


if __name__ == '__main__':
    main()
