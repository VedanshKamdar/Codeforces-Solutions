import random

# Available values
values = [-10, -10, -10, -10, -20, -20, -20, -20, 10, 10, 20, 20, 30, 30, 50, 50, 80, 80, 100, 100]

# Initialize your total
total = 1040

# Shuffle the values randomly
random.shuffle(values)

# Initialize a list to represent the values of the 52 cards
cards = [0] * 52

# Distribute the shuffled values randomly to the cards
for i in range(52):
    if i < 8:
        # Ensure that the first 8 cards get negative values
        cards[i] = values[i]
        total += cards[i]
    else:
        # Assign the remaining shuffled values
        cards[i] = random.choice(values)
        total += cards[i]

# Shuffle the cards for a final random order
random.shuffle(cards)

print("Assigned card values:", cards)
print("Total after assignment:", total)
