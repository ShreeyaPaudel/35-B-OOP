# Import necessary libraries
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
# Load the FIFA dataset
fifa = pd.read_csv('"C:/Users/TUF/Downloads/archive/fifa_eda.csv"')
# Line Chart Example
plt.figure(figsize=(10, 5))
plt.plot(fifa['Age'], label='Age')  # Plotting the line chart for player ages
plt.plot(fifa['Preferred Foot'], label='Preferred Foot')  # Adding another line for demonstration (shooting attributes)
plt.title('Line Chart Example - FIFA Dataset')  # Adding a title to the chart
plt.xlabel('Player Index')  # Labeling the X-axis as player index
plt.ylabel('Value')  # Labeling the Y-axis as the value of attributes
plt.legend()  # Displaying legend to identify different lines
plt.show()

