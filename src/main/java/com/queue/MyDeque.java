package com.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 对于窗口里的元素{2, 3, 5, 1 ,4}，单调队列里只维护{5, 4} 就够了，保持单调队列里单调递减，此时队列出口元素就是窗口里最大元素。
 * <p>
 * 此时大家应该怀疑单调队列里维护着{5, 4} 怎么配合窗口经行滑动呢？
 * <p>
 * 设计单调队列的时候，pop，和push操作要保持如下规则：
 * <p>
 * pop(value)：如果窗口移除的元素value等于单调队列的出口元素，那么队列弹出元素，否则不用任何操作
 * push(value)：如果push的元素value大于入口元素的数值，那么就将队列入口的元素弹出，直到push元素的数值小于等于队列入口元素的数值为止
 * 保持如上规则，每次窗口移动的时候，只要问que.front()就可以返回当前窗口的最大值。
 * <p>
 * 为了更直观的感受到单调队列的工作过程，以题目示例为例，输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 */

/**
 * 单调递减队列
 */
public class MyDeque {

    private int max = 0;

    private Deque<Integer> deque = new LinkedList<>();

    public void push(int num) {
        if (deque.isEmpty()) {
            deque.push(num);
            max = num;
            return;
        }
        /**如果push的元素，比最小的元素小，那么push进去，如果比最小的大，则剔除，直到小或者等于最小的元素 */
        Integer last = deque.peekLast();
        while (num > last) {
            deque.removeLast();
            if (!deque.isEmpty()) {
                last = deque.peekLast();
            } else {
                break;
            }
        }
        deque.addLast(num);
        max = deque.peekFirst();
    }

    //弹出元素
    public void pop(int num) {
        if (!deque.isEmpty() && num == max) {
            deque.removeFirst();
        }
        if (!deque.isEmpty()) {
            max = deque.peekFirst();
        } else {
            max = 0;
        }
    }

    public int peekMax() {
        return max;
    }


}