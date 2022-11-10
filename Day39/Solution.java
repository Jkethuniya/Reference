class BrowserHistory {
    private Stack<String> back;
    private Stack<String> forward;
    private String curPage = "";
    public BrowserHistory(String homepage) {
        back = new Stack<>();
        curPage = homepage;
        forward = new Stack<>();
    }
    
    public void visit(String url) {
        if (curPage != "") back.push(curPage);
        curPage = url;
        forward = new Stack<>();
    }
    
    public String back(int steps) {
        while (!back.isEmpty() && steps-- != 0) {
            forward.push(curPage);
            curPage = back.pop();
        }
        return curPage;
    }
    
    public String forward(int steps) {
        if (forward.isEmpty()) return curPage;  
        while (!forward.isEmpty() && steps-- != 0) {
            back.push(curPage);
            curPage = forward.pop();
        }
        return curPage;
    }
}
