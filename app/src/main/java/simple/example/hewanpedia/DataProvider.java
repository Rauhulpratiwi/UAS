package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Kuda;
import simple.example.hewanpedia.model.Marmut;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_lop_nama), ctx.getString(R.string.holland_lop_asal),
                ctx.getString(R.string.holland_lop_deskripsi), R.drawable.kelinci1));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_lop_nama), ctx.getString(R.string.mini_lop_asal),
                ctx.getString(R.string.mini_lop_deskripsi), R.drawable.kelinci2));
        kelincis.add(new Kelinci(ctx.getString(R.string.polish_nama), ctx.getString(R.string.polish_asal),
                ctx.getString(R.string.polish_deskripsi), R.drawable.kelinci3));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_rex_nama), ctx.getString(R.string.mini_rex_asal),
                ctx.getString(R.string.mini_rex_deskripsi), R.drawable.kelinci4));
        kelincis.add(new Kelinci(ctx.getString(R.string.dutch_nama), ctx.getString(R.string.dutch_asal),
                ctx.getString(R.string.dutch_deskripsi), R.drawable.kelinci5));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_satin_nama), ctx.getString(R.string.mini_satin_asal),
                ctx.getString(R.string.mini_satin_deskripsi), R.drawable.kelinci6));
        return kelincis;
    }

    private static List<Marmut> initDataMarmut(Context ctx) {
        List<Marmut> marmuts = new ArrayList<>();
        marmuts.add(new Marmut(ctx.getString(R.string.american_nama), ctx.getString(R.string.american_asal),
                ctx.getString(R.string.american_deskripsi), R.drawable.marmut1));
        marmuts.add(new Marmut(ctx.getString(R.string.abbysinian_nama), ctx.getString(R.string.abbysinian_asal),
                ctx.getString(R.string.abbysinian_deskripsi), R.drawable.marmut2));
        marmuts.add(new Marmut(ctx.getString(R.string.peruvian_nama), ctx.getString(R.string.peruvian_asal),
                ctx.getString(R.string.peruvian_deskripsi), R.drawable.marmut3));
        marmuts.add(new Marmut(ctx.getString(R.string.texel_nama), ctx.getString(R.string.texel_asal),
                ctx.getString(R.string.texel_deskripsi), R.drawable.marmut4));
        marmuts.add(new Marmut(ctx.getString(R.string.alpaca_nama), ctx.getString(R.string.alpaca_asal),
                ctx.getString(R.string.alpaca_deskripsi), R.drawable.marmut5));
        marmuts.add(new Marmut(ctx.getString(R.string.coronet_nama), ctx.getString(R.string.coronet_asal),
                ctx.getString(R.string.coronet_deskripsi), R.drawable.marmut6));
        return marmuts;
    }
    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda(ctx.getString(R.string.arab_nama), ctx.getString(R.string.arab_asal),
                ctx.getString(R.string.arab_deskripsi), R.drawable.kuda1));
        kudas.add(new Kuda(ctx.getString(R.string.thoroughbred_nama), ctx.getString(R.string.thoroughbred_asal),
                ctx.getString(R.string.thoroughbred_deskripsi), R.drawable.kuda2));
        kudas.add(new Kuda(ctx.getString(R.string.morgan_nama), ctx.getString(R.string.morgan_asal),
                ctx.getString(R.string.morgan_deskripsi), R.drawable.kuda3));
        kudas.add(new Kuda(ctx.getString(R.string.kuda_kuartal_amerika_nama), ctx.getString(R.string.kuda_kuartal_amerika_asal),
                ctx.getString(R.string.kuda_kuartal_amerika_deskripsi), R.drawable.kuda4));
        kudas.add(new Kuda(ctx.getString(R.string.apploosa_nama), ctx.getString(R.string.apploosa_asal),
                ctx.getString(R.string.apploosa_deskripsi), R.drawable.kuda5));
        kudas.add(new Kuda(ctx.getString(R.string.clydesdale_nama), ctx.getString(R.string.clydesdale_asal),
                ctx.getString(R.string.clydesdale_deskripsi), R.drawable.kuda6));
        return kudas;
    }
    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataMarmut(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
