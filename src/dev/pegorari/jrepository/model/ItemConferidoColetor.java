package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemConferidoColetor extends AbstractSankhyaEntity<ItemConferidoColetor> {
   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public BigDecimal getNumVol() {
        return this.getVo().asBigDecimal("NUMVOL");
   }

   public void setNumVol(BigDecimal numVol) {
        markAsChanged("NUMVOL", numVol);
   }

   public BigDecimal getQtdAvaria() {
        return this.getVo().asBigDecimal("QTDAVARIA");
   }

   public void setQtdAvaria(BigDecimal qtdAvaria) {
        markAsChanged("QTDAVARIA", qtdAvaria);
   }

   public BigDecimal getQuantidade() {
        return this.getVo().asBigDecimal("QUANTIDADE");
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getConfUsuFinal() {
        return this.getVo().asString("CONFUSUFINAL");
   }

   public void setConfUsuFinal(String confUsuFinal) {
        markAsChanged("CONFUSUFINAL", confUsuFinal);
   }

   public BigDecimal getQtdPecas() {
        return this.getVo().asBigDecimal("QTDPECAS");
   }

   public void setQtdPecas(BigDecimal qtdPecas) {
        markAsChanged("QTDPECAS", qtdPecas);
   }

   public String getSeriesNcm() {
        return this.getVo().asString("SERIESNCM");
   }

   public void setSeriesNcm(String seriesNcm) {
        markAsChanged("SERIESNCM", seriesNcm);
   }

   public String getTipoLeitura() {
        return this.getVo().asString("TIPO_LEITURA");
   }

   public void setTipoLeitura(String tipoLeitura) {
        markAsChanged("TIPO_LEITURA", tipoLeitura);
   }

   @Override
   public String getTableName() {
        return "TGWICC";
   }

   @Override
   public String getEntityName() {
        return "ItemConferidoColetor";
   }

   @Override
   public ItemConferidoColetor fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
