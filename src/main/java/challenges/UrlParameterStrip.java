package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class UrlParameterStrip { // https://edabit.com/challenge/W7juRdtzze5ZbrfbJ
    public static String stripUrlParams(String url, String[] removedParams) {
        // Guard clause for if there are no params
        if(!url.contains("?")) return url;

        String[] splitUrl = url.split("[?]");
        String[] params = splitUrl[1].split("[&]");

        List<String> removedParamsList = Arrays.asList(removedParams);
        if(params.length > 0) {
            params = removeParams(params, removedParamsList).toArray(new String[0]);
        }

        return splitUrl[0] + strifyParamsList(params);
    }

    private static String strifyParamsList(String[] params) {
        if(params.length < 1) return "";
        StringBuilder builder = new StringBuilder("?");
        for (String param : params) {
            builder.append(param).append("&");
        }
        return builder.deleteCharAt(builder.length() - 1).toString();
    }

    private static List<String> removeParams(String[] params, List<String> removedParamsList) {
        List<String> newParams = new ArrayList<>();

        for(String param : params) {
            String paramCode = param.split("[=]")[0];
            if(!removedParamsList.contains(paramCode)) {
                if (newParams.size() < 1) {
                    newParams.add(param);
                } else {
                    sanitiseParams(newParams, param, paramCode);
                }
            }
        }
        return newParams;
    }

    public static List<String> sanitiseParams(List<String> newParams, String param, String paramCode) {
        for (int i = 0; i < newParams.size(); i++) {
            String[] paramDetails = newParams.get(i).split("[=]");
            if (Objects.equals(paramDetails[0], paramCode) && parseInt(paramDetails[1]) < parseInt(param.split("[=]")[1])) {
                newParams.set(i, param);
                break;
            } else if (Objects.equals(paramDetails[0], paramCode) && parseInt(paramDetails[1]) >= parseInt(param.split("[=]")[1])) {
                break;
            } else if (i == newParams.size() - 1) { // Add it if it doesnt exist already
                newParams.add(param);
            }
        }
        return newParams;
    }

    public static String stripUrlParams(String url) {
        return stripUrlParams(url, new String[] {});
    }

    public static void main(String[] args) {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[]{""}));
    }
}
