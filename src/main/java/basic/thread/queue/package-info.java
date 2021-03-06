package basic.thread.queue;

/**
 * 1.非阻塞队列中的几个主要方法：
 * <p>
 * 　　add(E e):将元素e插入到队列末尾，如果插入成功，则返回true；如果插入失败（即队列已满），则会抛出异常；
 * <p>
 * 　　remove()：移除队首元素，若移除成功，则返回true；如果移除失败（队列为空），则会抛出异常；
 * <p>
 * 　　offer(E e)：将元素e插入到队列末尾，如果插入成功，则返回true；如果插入失败（即队列已满），则返回false；
 * <p>
 * 　　poll()：移除并获取队首元素，若成功，则返回队首元素；否则返回null；
 * <p>
 * 　　peek()：获取队首元素，若成功，则返回队首元素；否则返回null
 * <p>
 * 2.阻塞队列中的几个主要方法：
 * <p>
 * 　　阻塞队列包括了非阻塞队列中的大部分方法，上面列举的5个方法在阻塞队列中都存在，但是要注意这5个方法在阻塞队列中都进行了同步措施。除此之外，阻塞队列提供了另外4个非常有用的方法：
 * <p>
 * 　　put(E e) ,put方法用来向队尾存入元素，如果队列满，则等待；
 * <p>
 * 　　take()   ,take方法用来从队首取元素，如果队列为空，则等待；
 * <p>
 * 　　offer(E e,long timeout, TimeUnit unit), offer方法用来向队尾存入元素，如果队列满，则等待一定的时间，当时间期限达到时，如果还没有插入成功，则返回false；否则返回true；
 * <p>
 * 　　poll(long timeout, TimeUnit unit),      poll方法用来从队首取元素，如果队列空，则等待一定的时间，当时间期限达到时，如果取到，则返回null；否则返回取得的元素；
 * <p>
 */
