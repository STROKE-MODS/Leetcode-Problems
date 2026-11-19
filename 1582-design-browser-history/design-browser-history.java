class Node
{
    Node next;
    Node prev;
    String url;
    Node(String homepage)
    {
        this.url = homepage;
    }
}
class BrowserHistory {
    Node current;

    public BrowserHistory(String homepage) {
        Node newNode = new Node(homepage);
        current = newNode;
    }
    
    public void visit(String url) {
        Node visits = new Node(url);
        current.next = visits;
        visits.prev= current;
        current = current.next;
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++)
        {
            if(current.prev==null)
            {
                break;
            }
            current = current.prev;
        }
        return current.url;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++)
        {
            if(current.next!=null)
            {
                current= current.next;
            }
            else
            {
                break;
            }
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */