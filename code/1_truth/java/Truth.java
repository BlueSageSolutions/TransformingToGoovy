class Truth{
    static void testTruth(op){
        if(op){
            println("true " + op);
        }else{
            println("false " +op);
        }
    }

    public static void main(String[] args){
        testTruth(false);
        testTruth(0 == 1);
        testTruth(!"".isEmpty());
        testTruth(!new ArrayList().isEmpty());
        testTruth(!new HashMap().isEmpty());

        testTruth(true);
        testTruth(1 == 1);

        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        testTruth(!l.isEmpty());

        Map<Integer, String> m = new HashMap();
        m.put(1,"one");
        m.put(2,"two");
        testTruth(!m.isEmpty());

        String presenter = "Tucker";
        testTruth(!presenter.isEmpty());
        testTruth(presenter.equals("Tucker"));
        testTruth(presenter == "Tucker");
    }
}