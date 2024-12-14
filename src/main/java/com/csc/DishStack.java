package com.csc;

// Don't change this file!

public class DishStack {
  int size = 0;
  Dish[] dishes = new Dish[50];

  public DishStack() {
    size = 0;
  }
  void push(Dish d){
    dishes[size] = d;
    size++;

  }

  void pop(){
    dishes[--size] = null;
  }
  int size(){
    return size;
  }
  Dish peek(){
    return dishes[size-1];
  }

  void clear(){
    for(int i = 0; i < size; i++){
      dishes[i] = null;
    }
    size = 0;
  }

  public static void main(String[] args) {
    DishStack stack = new DishStack();
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");

    int stackSize = stack.size();
    System.out.println("Current Size: " + stackSize);

    System.out.println("Pushing...");
    stack.push(oneDish);
    stack.push(twoDish);
    stack.push(redDish);
    stack.push(blueDish);

// The variable sizeAfterPushes should equal four.
    int sizeAfterPushes = stack.size();
    System.out.println("Size after pushes: " + sizeAfterPushes);

// The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
    Dish peekedDish = stack.peek();
    String d = peekedDish.description;
    System.out.println("Peeked dish: " + d);

// The variable poppedDish should have a description of "A dish with a red fish pattern on it"
    System.out.println("Popping dish...");
    stack.pop();
    peekedDish = stack.peek();
    d = peekedDish.description;
    System.out.println("Peeked dish: " + d);


// The variable anotherPoppedDish should have a description of "A dish with two fish patterns on it"
    System.out.println("Popping dish...");
    stack.pop();
    peekedDish = stack.peek();
    d = peekedDish.description;
    System.out.println("Peeked dish: " + d);

// The variable finalSize should equal two.
    int finalSize = stack.size();
    System.out.println("Final size: " + finalSize);
    stack.clear();
    System.out.println("Clearing...");
    System.out.println("Size after clear: " + stack.size());
  }
}

