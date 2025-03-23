package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BannerLoginJiva extends AbstractSankhyaEntity<BannerLoginJiva> {
   private String nomeArq;
   private BigDecimal nuArquivo;
   private BigDecimal ordem;
   private BigDecimal tempo;
   private String url;
   private String profile;
   private String evo;

   public String getNomeArq() {
        return nomeArq;
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
        this.nomeArq = nomeArq;
   }

   public BigDecimal getNuArquivo() {
        return nuArquivo;
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        markAsChanged("NUARQUIVO", nuArquivo);
        this.nuArquivo = nuArquivo;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public BigDecimal getTempo() {
        return tempo;
   }

   public void setTempo(BigDecimal tempo) {
        markAsChanged("TEMPO", tempo);
        this.tempo = tempo;
   }

   public String getUrl() {
        return url;
   }

   public void setUrl(String url) {
        markAsChanged("URL", url);
        this.url = url;
   }

   public String getProfile() {
        return profile;
   }

   public void setProfile(String profile) {
        markAsChanged("PROFILE", profile);
        this.profile = profile;
   }

   public String getEvo() {
        return evo;
   }

   public void setEvo(String evo) {
        markAsChanged("EVO", evo);
        this.evo = evo;
   }

   @Override
   public String getTableName() {
        return "TSIBLG";
   }

   @Override
   public String getEntityName() {
        return "BannerLoginJiva";
   }

   @Override
   public BannerLoginJiva fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nomeArq = vo.asString("NOMEARQ");
        this.nuArquivo = vo.asBigDecimal("NUARQUIVO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.tempo = vo.asBigDecimal("TEMPO");
        this.url = vo.asString("URL");
        this.profile = vo.asString("PROFILE");
        this.evo = vo.asString("EVO");
        return this;
   }
}
