package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BannerLoginJiva extends AbstractSankhyaEntity<BannerLoginJiva> {
   public String getNomeArq() {
        return this.getVo().asString("NOMEARQ");
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
   }

   public BigDecimal getNuArquivo() {
        return this.getVo().asBigDecimal("NUARQUIVO");
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        markAsChanged("NUARQUIVO", nuArquivo);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public BigDecimal getTempo() {
        return this.getVo().asBigDecimal("TEMPO");
   }

   public void setTempo(BigDecimal tempo) {
        markAsChanged("TEMPO", tempo);
   }

   public String getUrl() {
        return this.getVo().asString("URL");
   }

   public void setUrl(String url) {
        markAsChanged("URL", url);
   }

   public String getProfile() {
        return this.getVo().asString("PROFILE");
   }

   public void setProfile(String profile) {
        markAsChanged("PROFILE", profile);
   }

   public String getEvo() {
        return this.getVo().asString("EVO");
   }

   public void setEvo(String evo) {
        markAsChanged("EVO", evo);
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
        return this;
   }
}
