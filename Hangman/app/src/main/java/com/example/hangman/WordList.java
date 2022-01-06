package com.example.hangman;

import java.util.HashSet;
import java.util.Set;

public class WordList {

    private Set<String> wordBank = new HashSet<>();


    public WordList() {
        loadDefaultWordList();
    }

    private void loadDefaultWordList() {
        wordBank = new HashSet<>();
        wordBank.add("able");
        wordBank.add("about");
        wordBank.add("account");
        wordBank.add("acid");
        wordBank.add("across");
        wordBank.add("act");
        wordBank.add("addition");
        wordBank.add("adjustment");
        wordBank.add("advertisement");
        wordBank.add("after");
        wordBank.add("again");
        wordBank.add("against");
        wordBank.add("agreement");
        wordBank.add("air");
        wordBank.add("all");
        wordBank.add("almost");
        wordBank.add("among");
        wordBank.add("amount");
        wordBank.add("amusement");
        wordBank.add("and");
        wordBank.add("angle");
        wordBank.add("angry");
        wordBank.add("animal");
        wordBank.add("answer");
        wordBank.add("ant");
        wordBank.add("any");
        wordBank.add("apparatus");
        wordBank.add("apple");
        wordBank.add("approval");
        wordBank.add("arch");
        wordBank.add("argument");
        wordBank.add("arm");
        wordBank.add("army");
        wordBank.add("art");
        wordBank.add("as");
        wordBank.add("at");
        wordBank.add("attack");
        wordBank.add("attempt");
        wordBank.add("attention");
        wordBank.add("attraction");
        wordBank.add("authority");
        wordBank.add("automatic");
        wordBank.add("awake");
        wordBank.add("baby");
        wordBank.add("back");
        wordBank.add("bad");
        wordBank.add("bag");
        wordBank.add("balance");
        wordBank.add("ball");
        wordBank.add("band");
        wordBank.add("base");
        wordBank.add("basin");
        wordBank.add("basket");
        wordBank.add("bath");
        wordBank.add("be");
        wordBank.add("beautiful");
        wordBank.add("because");
        wordBank.add("bed");
        wordBank.add("bee");
        wordBank.add("before");
        wordBank.add("behaviour");
        wordBank.add("belief");
        wordBank.add("bell");
        wordBank.add("bent");
        wordBank.add("berry");
        wordBank.add("between");
        wordBank.add("bird");
        wordBank.add("birth");
        wordBank.add("bit");
        wordBank.add("bite");
        wordBank.add("bitter");
        wordBank.add("black");
        wordBank.add("blade");
        wordBank.add("blood");
        wordBank.add("blow");
        wordBank.add("blue");
        wordBank.add("board");
        wordBank.add("boat");
        wordBank.add("body");
        wordBank.add("boiling");
        wordBank.add("bone");
        wordBank.add("book");
        wordBank.add("boot");
        wordBank.add("bottle");
        wordBank.add("box");
        wordBank.add("boy");
        wordBank.add("brain");
        wordBank.add("brake");
        wordBank.add("branch");
        wordBank.add("brass");
        wordBank.add("bread");
        wordBank.add("breath");
        wordBank.add("brick");
        wordBank.add("bridge");
        wordBank.add("bright");
        wordBank.add("broken");
        wordBank.add("brother");
        wordBank.add("brown");
        wordBank.add("brush");
        wordBank.add("bucket");
        wordBank.add("building");
        wordBank.add("bulb");
        wordBank.add("burn");
        wordBank.add("burst");
        wordBank.add("business");
        wordBank.add("but");
        wordBank.add("butter");
        wordBank.add("button");
        wordBank.add("by");
        wordBank.add("cake");
        wordBank.add("camera");
        wordBank.add("canvas");
        wordBank.add("card");
        wordBank.add("care");
        wordBank.add("carriage");
        wordBank.add("cart");
        wordBank.add("cat");
        wordBank.add("cause");
        wordBank.add("certain");
        wordBank.add("chain");
        wordBank.add("chalk");
        wordBank.add("chance");
        wordBank.add("change");
        wordBank.add("cheap");
        wordBank.add("cheese");
        wordBank.add("chemical");
        wordBank.add("chest");
        wordBank.add("chief");
        wordBank.add("chin");
        wordBank.add("church");
        wordBank.add("circle");
        wordBank.add("clean");
        wordBank.add("clear");
        wordBank.add("clock");
        wordBank.add("cloth");
        wordBank.add("cloud");
        wordBank.add("coal");
        wordBank.add("coat");
        wordBank.add("cold");
        wordBank.add("collar");
        wordBank.add("colour");
        wordBank.add("comb");
        wordBank.add("come");
        wordBank.add("comfort");
        wordBank.add("committee");
        wordBank.add("common");
        wordBank.add("company");
        wordBank.add("comparison");
        wordBank.add("competition");
        wordBank.add("complete");
        wordBank.add("complex");
        wordBank.add("condition");
        wordBank.add("connection");
        wordBank.add("conscious");
        wordBank.add("control");
        wordBank.add("cook");
        wordBank.add("copper");
        wordBank.add("copy");
        wordBank.add("cord");
        wordBank.add("cork");
        wordBank.add("cotton");
        wordBank.add("cough");
        wordBank.add("country");
        wordBank.add("cover");
        wordBank.add("cow");
        wordBank.add("crack");
        wordBank.add("credit");
        wordBank.add("crime");
        wordBank.add("cruel");
        wordBank.add("crush");
        wordBank.add("cry");
        wordBank.add("cup");
        wordBank.add("cup");
        wordBank.add("current");
        wordBank.add("curtain");
        wordBank.add("curve");
        wordBank.add("cushion");
        wordBank.add("damage");
        wordBank.add("danger");
        wordBank.add("dark");
        wordBank.add("daughter");
        wordBank.add("day");
        wordBank.add("dead");
        wordBank.add("dear");
        wordBank.add("death");
        wordBank.add("debt");
        wordBank.add("decision");
        wordBank.add("deep");
        wordBank.add("degree");
        wordBank.add("delicate");
        wordBank.add("dependent");
        wordBank.add("design");
        wordBank.add("desire");
        wordBank.add("destruction");
        wordBank.add("detail");
        wordBank.add("development");
        wordBank.add("different");
        wordBank.add("digestion");
        wordBank.add("direction");
        wordBank.add("dirty");
        wordBank.add("discovery");
        wordBank.add("discussion");
        wordBank.add("disease");
        wordBank.add("disgust");
        wordBank.add("distance");
        wordBank.add("distribution");
        wordBank.add("division");
        wordBank.add("do");
        wordBank.add("dog");
        wordBank.add("door");
        wordBank.add("doubt");
        wordBank.add("down");
        wordBank.add("drain");
        wordBank.add("drawer");
        wordBank.add("dress");
        wordBank.add("drink");
        wordBank.add("driving");
        wordBank.add("drop");
        wordBank.add("dry");
        wordBank.add("dust");
        wordBank.add("ear");
        wordBank.add("early");
        wordBank.add("earth");
        wordBank.add("east");
        wordBank.add("edge");
        wordBank.add("education");
        wordBank.add("effect");
        wordBank.add("egg");
        wordBank.add("elastic");
        wordBank.add("electric");
        wordBank.add("end");
        wordBank.add("engine");
        wordBank.add("enough");
        wordBank.add("equal");
        wordBank.add("error");
        wordBank.add("even");
        wordBank.add("event");
        wordBank.add("ever");
        wordBank.add("every");
        wordBank.add("example");
        wordBank.add("exchange");
        wordBank.add("existence");
        wordBank.add("expansion");
        wordBank.add("experience");
        wordBank.add("expert");
        wordBank.add("eye");
        wordBank.add("face");
        wordBank.add("fact");
        wordBank.add("fall");
        wordBank.add("false");
        wordBank.add("family");
        wordBank.add("far");
        wordBank.add("farm");
        wordBank.add("fat");
        wordBank.add("father");
        wordBank.add("fear");
        wordBank.add("feather");
        wordBank.add("feeble");
        wordBank.add("feeling");
        wordBank.add("female");
        wordBank.add("fertile");
        wordBank.add("fiction");
        wordBank.add("field");
        wordBank.add("fight");
        wordBank.add("finger");
        wordBank.add("fire");
        wordBank.add("first");
        wordBank.add("fish");
        wordBank.add("fixed");
        wordBank.add("flag");
        wordBank.add("flame");
        wordBank.add("flat");
        wordBank.add("flight");
        wordBank.add("floor");
        wordBank.add("flower");
        wordBank.add("fly");
        wordBank.add("fold");
        wordBank.add("food");
        wordBank.add("foolish");
        wordBank.add("foot");
        wordBank.add("for");
        wordBank.add("force");
        wordBank.add("fork");
        wordBank.add("form");
        wordBank.add("forward");
        wordBank.add("fowl");
        wordBank.add("frame");
        wordBank.add("free");
        wordBank.add("frequent");
        wordBank.add("friend");
        wordBank.add("from");
        wordBank.add("front");
        wordBank.add("fruit");
        wordBank.add("full");
        wordBank.add("future");
        wordBank.add("garden");
        wordBank.add("general");
        wordBank.add("get");
        wordBank.add("girl");
        wordBank.add("give");
        wordBank.add("glass");
        wordBank.add("glove");
        wordBank.add("go");
        wordBank.add("goat");
        wordBank.add("gold");
        wordBank.add("good");
        wordBank.add("government");
        wordBank.add("grain");
        wordBank.add("grass");
        wordBank.add("great");
        wordBank.add("green");
        wordBank.add("grey");
        wordBank.add("grip");
        wordBank.add("group");
        wordBank.add("growth");
        wordBank.add("guide");
        wordBank.add("gun");
        wordBank.add("hair");
        wordBank.add("hammer");
        wordBank.add("hand");
        wordBank.add("hanging");
        wordBank.add("happy");
        wordBank.add("harbour");
        wordBank.add("hard");
        wordBank.add("harmony");
        wordBank.add("hat");
        wordBank.add("hate");
        wordBank.add("have");
        wordBank.add("he");
        wordBank.add("head");
        wordBank.add("healthy");
        wordBank.add("hear");
        wordBank.add("hearing");
        wordBank.add("heart");
        wordBank.add("heat");
        wordBank.add("help");
        wordBank.add("high");
        wordBank.add("history");
        wordBank.add("hole");
        wordBank.add("hollow");
        wordBank.add("hook");
        wordBank.add("hope");
        wordBank.add("horn");
        wordBank.add("horse");
        wordBank.add("hospital");
        wordBank.add("hour");
        wordBank.add("house");
        wordBank.add("how");
        wordBank.add("humour");
        wordBank.add("I");
        wordBank.add("ice");
        wordBank.add("idea");
        wordBank.add("if");
        wordBank.add("ill");
        wordBank.add("important");
        wordBank.add("impulse");
        wordBank.add("in");
        wordBank.add("increase");
        wordBank.add("industry");
        wordBank.add("ink");
        wordBank.add("insect");
        wordBank.add("instrument");
        wordBank.add("insurance");
        wordBank.add("interest");
        wordBank.add("invention");
        wordBank.add("iron");
        wordBank.add("island");
        wordBank.add("jelly");
        wordBank.add("jewel");
        wordBank.add("join");
        wordBank.add("journey");
        wordBank.add("judge");
        wordBank.add("jump");
        wordBank.add("keep");
        wordBank.add("kettle");
        wordBank.add("key");
        wordBank.add("kick");
        wordBank.add("kind");
        wordBank.add("kiss");
        wordBank.add("knee");
        wordBank.add("knife");
        wordBank.add("knot");
        wordBank.add("knowledge");
        wordBank.add("land");
        wordBank.add("language");
        wordBank.add("last");
        wordBank.add("late");
        wordBank.add("laugh");
        wordBank.add("law");
        wordBank.add("lead");
        wordBank.add("leaf");
        wordBank.add("learning");
        wordBank.add("leather");
        wordBank.add("left");
        wordBank.add("leg");
        wordBank.add("let");
        wordBank.add("letter");
        wordBank.add("level");
        wordBank.add("library");
        wordBank.add("lift");
        wordBank.add("light");
        wordBank.add("like");
        wordBank.add("limit");
        wordBank.add("line");
        wordBank.add("linen");
        wordBank.add("lip");
        wordBank.add("liquid");
        wordBank.add("list");
        wordBank.add("little");
        wordBank.add("living");
        wordBank.add("lock");
        wordBank.add("long");
        wordBank.add("look");
        wordBank.add("loose");
        wordBank.add("loss");
        wordBank.add("loud");
        wordBank.add("love");
        wordBank.add("low");
        wordBank.add("machine");
        wordBank.add("make");
        wordBank.add("male");
        wordBank.add("man");
        wordBank.add("manager");
        wordBank.add("map");
        wordBank.add("mark");
        wordBank.add("market");
        wordBank.add("married");
        wordBank.add("mass");
        wordBank.add("match");
        wordBank.add("material");
        wordBank.add("may");
        wordBank.add("meal");
        wordBank.add("measure");
        wordBank.add("meat");
        wordBank.add("medical");
        wordBank.add("meeting");
        wordBank.add("memory");
        wordBank.add("metal");
        wordBank.add("middle");
        wordBank.add("military");
        wordBank.add("milk");
        wordBank.add("mind");
        wordBank.add("mine");
        wordBank.add("minute");
        wordBank.add("mist");
        wordBank.add("mixed");
        wordBank.add("money");
        wordBank.add("monkey");
        wordBank.add("month");
        wordBank.add("moon");
        wordBank.add("morning");
        wordBank.add("mother");
        wordBank.add("motion");
        wordBank.add("mountain");
        wordBank.add("mouth");
        wordBank.add("move");
        wordBank.add("much");
        wordBank.add("muscle");
        wordBank.add("music");
        wordBank.add("nail");
        wordBank.add("name");
        wordBank.add("narrow");
        wordBank.add("nation");
        wordBank.add("natural");
        wordBank.add("near");
        wordBank.add("necessary");
        wordBank.add("neck");
        wordBank.add("need");
        wordBank.add("needle");
        wordBank.add("nerve");
        wordBank.add("net");
        wordBank.add("new");
        wordBank.add("news");
        wordBank.add("night");
        wordBank.add("no");
        wordBank.add("noise");
        wordBank.add("normal");
        wordBank.add("north");
        wordBank.add("nose");
        wordBank.add("not");
        wordBank.add("note");
        wordBank.add("now");
        wordBank.add("number");
        wordBank.add("nut");
        wordBank.add("observation");
        wordBank.add("of");
        wordBank.add("off");
        wordBank.add("offer");
        wordBank.add("office");
        wordBank.add("oil");
        wordBank.add("old");
        wordBank.add("on");
        wordBank.add("only");
        wordBank.add("open");
        wordBank.add("operation");
        wordBank.add("opinion");
        wordBank.add("opposite");
        wordBank.add("or");
        wordBank.add("orange");
        wordBank.add("order");
        wordBank.add("organization");
        wordBank.add("ornament");
        wordBank.add("other");
        wordBank.add("out");
        wordBank.add("oven");
        wordBank.add("over");
        wordBank.add("owner");
        wordBank.add("page");
        wordBank.add("pain");
        wordBank.add("paint");
        wordBank.add("paper");
        wordBank.add("parallel");
        wordBank.add("parcel");
        wordBank.add("part");
        wordBank.add("past");
        wordBank.add("paste");
        wordBank.add("payment");
        wordBank.add("peace");
        wordBank.add("pen");
        wordBank.add("pencil");
        wordBank.add("person");
        wordBank.add("physical");
        wordBank.add("picture");
        wordBank.add("pig");
        wordBank.add("pin");
        wordBank.add("pipe");
        wordBank.add("place");
        wordBank.add("plane");
        wordBank.add("plant");
        wordBank.add("plate");
        wordBank.add("play");
        wordBank.add("please");
        wordBank.add("pleasure");
        wordBank.add("plough");
        wordBank.add("pocket");
        wordBank.add("point");
        wordBank.add("poison");
        wordBank.add("polish");
        wordBank.add("political");
        wordBank.add("poor");
        wordBank.add("porter");
        wordBank.add("position");
        wordBank.add("possible");
        wordBank.add("pot");
        wordBank.add("potato");
        wordBank.add("powder");
        wordBank.add("power");
        wordBank.add("present");
        wordBank.add("price");
        wordBank.add("print");
        wordBank.add("prison");
        wordBank.add("private");
        wordBank.add("probable");
        wordBank.add("process");
        wordBank.add("produce");
        wordBank.add("profit");
        wordBank.add("property");
        wordBank.add("prose");
        wordBank.add("protest");
        wordBank.add("public");
        wordBank.add("pull");
        wordBank.add("pump");
        wordBank.add("punishment");
        wordBank.add("purpose");
        wordBank.add("push");
        wordBank.add("put");
        wordBank.add("quality");
        wordBank.add("question");
        wordBank.add("quick");
        wordBank.add("quiet");
        wordBank.add("quite");
        wordBank.add("rail");
        wordBank.add("rain");
        wordBank.add("range");
        wordBank.add("rat");
        wordBank.add("rate");
        wordBank.add("ray");
        wordBank.add("reaction");
        wordBank.add("reading");
        wordBank.add("ready");
        wordBank.add("reason");
        wordBank.add("receipt");
        wordBank.add("record");
        wordBank.add("red");
        wordBank.add("regret");
        wordBank.add("regular");
        wordBank.add("relation");
        wordBank.add("religion");
        wordBank.add("representative");
        wordBank.add("request");
        wordBank.add("respect");
        wordBank.add("responsible");
        wordBank.add("rest");
        wordBank.add("reward");
        wordBank.add("rhythm");
        wordBank.add("rice");
        wordBank.add("right");
        wordBank.add("ring");
        wordBank.add("river");
        wordBank.add("road");
        wordBank.add("rod");
        wordBank.add("roll");
        wordBank.add("roof");
        wordBank.add("room");
        wordBank.add("root");
        wordBank.add("rough");
        wordBank.add("round");
        wordBank.add("rub");
        wordBank.add("rule");
        wordBank.add("run");
        wordBank.add("sad");
        wordBank.add("safe");
        wordBank.add("sail");
        wordBank.add("salt");
        wordBank.add("same");
        wordBank.add("sand");
        wordBank.add("say");
        wordBank.add("scale");
        wordBank.add("school");
        wordBank.add("science");
        wordBank.add("scissors");
        wordBank.add("screw");
        wordBank.add("sea");
        wordBank.add("seat");
        wordBank.add("second");
        wordBank.add("secret");
        wordBank.add("secretary");
        wordBank.add("see");
        wordBank.add("seed");
        wordBank.add("seem");
        wordBank.add("selection");
        wordBank.add("self");
        wordBank.add("send");
        wordBank.add("sense");
        wordBank.add("separate");
        wordBank.add("serious");
        wordBank.add("servant");
        wordBank.add("shade");
        wordBank.add("shake");
        wordBank.add("shame");
        wordBank.add("sharp");
        wordBank.add("sheep");
        wordBank.add("shelf");
        wordBank.add("ship");
        wordBank.add("shirt");
        wordBank.add("shock");
        wordBank.add("shoe");
        wordBank.add("short");
        wordBank.add("shut");
        wordBank.add("side");
        wordBank.add("sign");
        wordBank.add("silk");
        wordBank.add("silver");
        wordBank.add("simple");
        wordBank.add("sister");
        wordBank.add("size");
        wordBank.add("skin");
        wordBank.add("");
        wordBank.add("skirt");
        wordBank.add("sky");
        wordBank.add("sleep");
        wordBank.add("slip");
        wordBank.add("slope");
        wordBank.add("slow");
        wordBank.add("small");
        wordBank.add("smash");
        wordBank.add("smell");
        wordBank.add("smile");
        wordBank.add("smoke");
        wordBank.add("smooth");
        wordBank.add("snake");
        wordBank.add("sneeze");
        wordBank.add("snow");
        wordBank.add("so");
        wordBank.add("soap");
        wordBank.add("society");
        wordBank.add("sock");
        wordBank.add("soft");
        wordBank.add("solid");
        wordBank.add("some");
        wordBank.add("son");
        wordBank.add("song");
        wordBank.add("sort");
        wordBank.add("sound");
        wordBank.add("soup");
        wordBank.add("south");
        wordBank.add("space");
        wordBank.add("spade");
        wordBank.add("special");
        wordBank.add("sponge");
        wordBank.add("spoon");
        wordBank.add("spring");
        wordBank.add("square");
        wordBank.add("stage");
        wordBank.add("stamp");
        wordBank.add("star");
        wordBank.add("start");
        wordBank.add("statement");
        wordBank.add("station");
        wordBank.add("steam");
        wordBank.add("steel");
        wordBank.add("stem");
        wordBank.add("step");
        wordBank.add("stick");
        wordBank.add("sticky");
        wordBank.add("stiff");
        wordBank.add("still");
        wordBank.add("stitch");
        wordBank.add("stocking");
        wordBank.add("stomach");
        wordBank.add("stone");
        wordBank.add("stop");
        wordBank.add("store");
        wordBank.add("story");
        wordBank.add("straight");
        wordBank.add("strange");
        wordBank.add("street");
        wordBank.add("stretch");
        wordBank.add("strong");
        wordBank.add("structure");
        wordBank.add("substance");
        wordBank.add("such");
        wordBank.add("sudden");
        wordBank.add("sugar");
        wordBank.add("suggestion");
        wordBank.add("summer");
        wordBank.add("sun");
        wordBank.add("support");
        wordBank.add("surprise");
        wordBank.add("sweet");
        wordBank.add("swim");
        wordBank.add("system");
        wordBank.add("table");
        wordBank.add("tail");
        wordBank.add("take");
        wordBank.add("talk");
        wordBank.add("tall");
        wordBank.add("taste");
        wordBank.add("tax");
        wordBank.add("teaching");
        wordBank.add("tendency");
        wordBank.add("test");
        wordBank.add("than");
        wordBank.add("that");
        wordBank.add("the");
        wordBank.add("then");
        wordBank.add("theory");
        wordBank.add("there");
        wordBank.add("thick");
        wordBank.add("thin");
        wordBank.add("thing");
        wordBank.add("this");
        wordBank.add("thought");
        wordBank.add("thread");
        wordBank.add("throat");
        wordBank.add("through");
        wordBank.add("through");
        wordBank.add("thumb");
        wordBank.add("thunder");
        wordBank.add("ticket");
        wordBank.add("tight");
        wordBank.add("till");
        wordBank.add("time");
        wordBank.add("tin");
        wordBank.add("tired");
        wordBank.add("to");
        wordBank.add("toe");
        wordBank.add("together");
        wordBank.add("tomorrow");
        wordBank.add("tongue");
        wordBank.add("tooth");
        wordBank.add("top");
        wordBank.add("touch");
        wordBank.add("town");
        wordBank.add("trade");
        wordBank.add("train");
        wordBank.add("transport");
        wordBank.add("tray");
        wordBank.add("tree");
        wordBank.add("trick");
        wordBank.add("trouble");
        wordBank.add("trousers");
        wordBank.add("true");
        wordBank.add("turn");
        wordBank.add("twist");
        wordBank.add("umbrella");
        wordBank.add("under");
        wordBank.add("unit");
        wordBank.add("up");
        wordBank.add("use");
        wordBank.add("value");
        wordBank.add("verse");
        wordBank.add("very");
        wordBank.add("vessel");
        wordBank.add("view");
        wordBank.add("violent");
        wordBank.add("voice");
        wordBank.add("waiting");
        wordBank.add("walk");
        wordBank.add("wall");
        wordBank.add("war");
        wordBank.add("warm");
        wordBank.add("wash");
        wordBank.add("waste");
        wordBank.add("watch");
        wordBank.add("water");
        wordBank.add("wave");
        wordBank.add("wax");
        wordBank.add("way");
        wordBank.add("weather");
        wordBank.add("week");
        wordBank.add("weight");
        wordBank.add("well");
        wordBank.add("west");
        wordBank.add("wet");
        wordBank.add("wheel");
        wordBank.add("when");
        wordBank.add("where");
        wordBank.add("while");
        wordBank.add("whip");
        wordBank.add("whistle");
        wordBank.add("white");
        wordBank.add("who");
        wordBank.add("why");
        wordBank.add("wide");
        wordBank.add("will");
        wordBank.add("wind");
        wordBank.add("window");
        wordBank.add("wine");
        wordBank.add("wing");
        wordBank.add("winter");
        wordBank.add("wire");
        wordBank.add("wise");
        wordBank.add("with");
        wordBank.add("woman");
        wordBank.add("wood");
        wordBank.add("wool");
        wordBank.add("word");
        wordBank.add("work");
        wordBank.add("worm");
        wordBank.add("wound");
        wordBank.add("writing");
        wordBank.add("wrong");
        wordBank.add("year");
        wordBank.add("yellow");
        wordBank.add("yes");
        wordBank.add("yesterday");
        wordBank.add("you");
        wordBank.add("young");
        wordBank.add("android");
    }

    public Set<String> getWordBank() {
        return wordBank;
    }

    public void setWordBank(Set<String> wordBank) {
        this.wordBank = wordBank;
    }
}