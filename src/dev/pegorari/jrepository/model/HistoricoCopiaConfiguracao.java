package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoCopiaConfiguracao extends AbstractSankhyaEntity<HistoricoCopiaConfiguracao> {
   private String confTop;
   private String abaSeg;
   private String chave;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuNico;
   private String removeAnt;
   private String selecaoTelas;
   private String tipo;

   public String getConfTop() {
        return confTop;
   }

   public void setConfTop(String confTop) {
        markAsChanged("CONFTOP", confTop);
        this.confTop = confTop;
   }

   public String getAbaSeg() {
        return abaSeg;
   }

   public void setAbaSeg(String abaSeg) {
        markAsChanged("ABASEG", abaSeg);
        this.abaSeg = abaSeg;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
        this.nuNico = nuNico;
   }

   public String getRemoveAnt() {
        return removeAnt;
   }

   public void setRemoveAnt(String removeAnt) {
        markAsChanged("REMOVEANT", removeAnt);
        this.removeAnt = removeAnt;
   }

   public String getSelecaoTelas() {
        return selecaoTelas;
   }

   public void setSelecaoTelas(String selecaoTelas) {
        markAsChanged("SELECAOTELAS", selecaoTelas);
        this.selecaoTelas = selecaoTelas;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.confTop = vo.asString("CONFTOP");
        this.abaSeg = vo.asString("ABASEG");
        this.chave = vo.asString("CHAVE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.removeAnt = vo.asString("REMOVEANT");
        this.selecaoTelas = vo.asString("SELECAOTELAS");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
