package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoCopiaConfiguracao extends AbstractSankhyaEntity<HistoricoCopiaConfiguracao> {
   public String getConfTop() {
        return this.getVo().asString("CONFTOP");
   }

   public void setConfTop(String confTop) {
        markAsChanged("CONFTOP", confTop);
   }

   public String getAbaSeg() {
        return this.getVo().asString("ABASEG");
   }

   public void setAbaSeg(String abaSeg) {
        markAsChanged("ABASEG", abaSeg);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public String getRemoveAnt() {
        return this.getVo().asString("REMOVEANT");
   }

   public void setRemoveAnt(String removeAnt) {
        markAsChanged("REMOVEANT", removeAnt);
   }

   public String getSelecaoTelas() {
        return this.getVo().asString("SELECAOTELAS");
   }

   public void setSelecaoTelas(String selecaoTelas) {
        markAsChanged("SELECAOTELAS", selecaoTelas);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSIHCF";
   }

   @Override
   public String getEntityName() {
        return "HistoricoCopiaConfiguracao";
   }

   @Override
   public HistoricoCopiaConfiguracao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
