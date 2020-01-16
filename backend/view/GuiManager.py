import tkinter as tk
import os
from backend.service.Features import *

def action():
    response = entry.get()
    if is_definition(response):
        outputText.config(bg = "green", text = "Your sentence is a definition")
    else:
        outputText.config(bg = "red", text = "Your sentence is not a definition")

root = tk.Tk()

root.geometry('500x300')
root.title("DeftEval")
text = tk.Label(root, text=" Add a sentence to classify if is a definition or not.")
text.place(x = 50, y = 50)

entry =tk.Entry(root)
entry.place(x = 50, y = 70, width= 400)

valider = tk.Button(root, text = "Get result", command = action)
valider.place(x = 50, y = 90)

outputText = tk.Label(root, text="")
outputText.place(x = 50, y = 120)

root.mainloop()