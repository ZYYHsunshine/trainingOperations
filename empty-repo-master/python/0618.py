#!/usr/bin/env python
# coding: utf-8

# # fizzBuzz

# In[22]:


def fizzBuzz(n):
        outList = []
        for i in range(1,n+1):
            if i % 15 == 0:
                outList.append("FizzBuzz")
            elif i % 5 == 0:
                outList.append("Buzz")
            elif i % 3 == 0:
                outList.append("Fizz")
            else:
                outList.append(str(i))
        return outList


# In[23]:


print(fizzBuzz(15))


# # MarsRover

# In[287]:


Rover = {"x":0,"y":0,"direction":"N"}


# In[247]:


def move(step,Rover):
    if Rover["direction"] == "N":
        Rover["y"] = Rover["y"]+ int(step)
    elif Rover["direction"]=="W":
        Rover["x"] = Rover["x"]- int(step)
    elif Rover["direction"]=="S":
        Rover["y"] = Rover["y"]- int(step)
    elif Rover["direction"]=="E":
        Rover["x"] = Rover["x"]+ int(step)
    return Rover

def dire(direction ,Rover):
    if direction == "L":
        if Rover["direction"] == "N":
            Rover["direction"] = "W"
        elif Rover["direction"] == "W":
            Rover["direction"] = "S"
        elif Rover["direction"] == "S":
            Rover["direction"] = "E"
        elif Rover["direction"] == "E":
            Rover["direction"] = "N"
    else:
        if Rover["direction"] == "N":
            Rover["direction"] = "E"
        elif Rover["direction"] == "W":
            Rover["direction"] = "N"
        elif Rover["direction"] == "S":
            Rover["direction"] = "W"
        elif Rover["direction"] == "E":
            Rover["direction"] = "S"
        return Rover
    return Rover


# In[281]:


#Test
def test_move_5(Rover):
    #Given
    step = 5
    #when
    pre_Rover = move(step,Rover)
    #then 
    result_Rover = {"x":0,"y":5,"direction":"N"}
    if result_Rover == pre_Rover:
        print ("good boy")
    else :
        print ("bad boy")
        
#Test
def test_dire_L(Rover):
    #Given
    direction = "L"
    #when
    pre_Rover = dire(direction,Rover)
    #then 
    result_Rover = {"x":0,"y":0,"direction":"W"}
    if result_Rover == pre_Rover:
        print ("good boy")
    else :
        print ("bad boy")


# In[285]:


test_move_5(Rover)


# In[288]:


test_dire_L(Rover)


# # 面向对象思想

# In[289]:


class MarsRover(object):
    x = 0   
    y = 0
    direction = "N"


# In[298]:


def move(step,Rover):
    if MarsRover.direction == "N":
        MarsRover.y = MarsRover.y+ int(step)
    elif arsRover.direction=="W":
        MarsRover.x = MarsRover.x- int(step)
    elif arsRover.direction=="S":
        MarsRover.y = MarsRover.y- int(step)
    elif arsRover.direction=="E":
        MarsRover.x = MarsRover.x+ int(step)
    return Rover

def dire(direction,Rover):
    if direction == "L":
        if MarsRover.direction == "N":
            MarsRover.direction = "W"
        elif MarsRover.direction == "W":
            MarsRover.direction = "S"
        elif MarsRover.direction == "S":
            MarsRover.direction = "E"
        elif MarsRover.direction == "E":
            MarsRover.direction = "N"
    else:
        if MarsRover.direction == "N":
            MarsRover.direction = "E"
        elif MarsRover.direction == "W":
            MarsRover.direction = "N"
        elif MarsRover.direction == "S":
            MarsRover.direction = "W"
        elif MarsRover.direction == "E":
            MarsRover.direction = "S"
        return Rover
    return Rover


# In[313]:


Rover = MarsRover()
move(6,Rover).y


# In[290]:


print(MarsRover.x)


# In[ ]:




