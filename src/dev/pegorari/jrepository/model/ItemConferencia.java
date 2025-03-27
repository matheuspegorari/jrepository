package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemConferencia extends AbstractSankhyaEntity<ItemConferencia> {
   public String getAceitarDif() {
        return this.getVo().asString("ACEITARDIF");
   }

   public void setAceitarDif(String aceitarDif) {
        markAsChanged("ACEITARDIF", aceitarDif);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodVolCompra() {
        return this.getVo().asString("CODVOLCOMPRA");
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
   }

   public BigDecimal getCodVolume() {
        return this.getVo().asBigDecimal("CODVOLUME");
   }

   public void setCodVolume(BigDecimal codVolume) {
        markAsChanged("CODVOLUME", codVolume);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public Timestamp getDtValMin() {
        return this.getVo().asTimestamp("DTVALMIN");
   }

   public void setDtValMin(Timestamp dtValMin) {
        markAsChanged("DTVALMIN", dtValMin);
   }

   public String getIgnorar() {
        return this.getVo().asString("IGNORAR");
   }

   public void setIgnorar(String ignorar) {
        markAsChanged("IGNORAR", ignorar);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public BigDecimal getQtdAvaria() {
        return this.getVo().asBigDecimal("QTDAVARIA");
   }

   public void setQtdAvaria(BigDecimal qtdAvaria) {
        markAsChanged("QTDAVARIA", qtdAvaria);
   }

   public BigDecimal getQtdeConf() {
        return this.getVo().asBigDecimal("QTDECONF");
   }

   public void setQtdeConf(BigDecimal qtdeConf) {
        markAsChanged("QTDECONF", qtdeConf);
   }

   public String getRecontagem() {
        return this.getVo().asString("RECONTAGEM");
   }

   public void setRecontagem(String recontagem) {
        markAsChanged("RECONTAGEM", recontagem);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipoVolume() {
        return this.getVo().asString("TIPOVOLUME");
   }

   public void setTipoVolume(String tipoVolume) {
        markAsChanged("TIPOVOLUME", tipoVolume);
   }

   public BigDecimal getCodMdiv() {
        return this.getVo().asBigDecimal("CODMDIV");
   }

   public void setCodMdiv(BigDecimal codMdiv) {
        markAsChanged("CODMDIV", codMdiv);
   }

   public BigDecimal getQtdeDif() {
        return this.getVo().asBigDecimal("QTDEDIF");
   }

   public void setQtdeDif(BigDecimal qtdeDif) {
        markAsChanged("QTDEDIF", qtdeDif);
   }

   public BigDecimal getCodUsuDiv() {
        return this.getVo().asBigDecimal("CODUSUDIV");
   }

   public void setCodUsuDiv(BigDecimal codUsuDiv) {
        markAsChanged("CODUSUDIV", codUsuDiv);
   }

   public String getDevolver() {
        return this.getVo().asString("DEVOLVER");
   }

   public void setDevolver(String devolver) {
        markAsChanged("DEVOLVER", devolver);
   }

   public String getReceberAvaria() {
        return this.getVo().asString("RECEBERAVARIA");
   }

   public void setReceberAvaria(String receberAvaria) {
        markAsChanged("RECEBERAVARIA", receberAvaria);
   }

   public BigDecimal getQtdPecas() {
        return this.getVo().asBigDecimal("QTDPECAS");
   }

   public void setQtdPecas(BigDecimal qtdPecas) {
        markAsChanged("QTDPECAS", qtdPecas);
   }

   @Override
   public String getTableName() {
        return "TGWCOI";
   }

   @Override
   public String getEntityName() {
        return "ItemConferencia";
   }

   @Override
   public ItemConferencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
