package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroConferencia extends AbstractSankhyaEntity<RegistroConferencia> {
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

   public BigDecimal getCodUsuConf() {
        return this.getVo().asBigDecimal("CODUSUCONF");
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDhFim() {
        return this.getVo().asTimestamp("DHFIM");
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
   }

   public Timestamp getDhIni() {
        return this.getVo().asTimestamp("DHINI");
   }

   public void setDhIni(Timestamp dhIni) {
        markAsChanged("DHINI", dhIni);
   }

   public String getFechado() {
        return this.getVo().asString("FECHADO");
   }

   public void setFechado(String fechado) {
        markAsChanged("FECHADO", fechado);
   }

   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getQtdAvariaVolPad() {
        return this.getVo().asBigDecimal("QTDAVARIAVOLPAD");
   }

   public void setQtdAvariaVolPad(BigDecimal qtdAvariaVolPad) {
        markAsChanged("QTDAVARIAVOLPAD", qtdAvariaVolPad);
   }

   public BigDecimal getQtdRecebidaVolPad() {
        return this.getVo().asBigDecimal("QTDRECEBIDAVOLPAD");
   }

   public void setQtdRecebidaVolPad(BigDecimal qtdRecebidaVolPad) {
        markAsChanged("QTDRECEBIDAVOLPAD", qtdRecebidaVolPad);
   }

   public String getRecontagem() {
        return this.getVo().asString("RECONTAGEM");
   }

   public void setRecontagem(String recontagem) {
        markAsChanged("RECONTAGEM", recontagem);
   }

   public String getUma() {
        return this.getVo().asString("UMA");
   }

   public void setUma(String uma) {
        markAsChanged("UMA", uma);
   }

   public String getConfFinalizada() {
        return this.getVo().asString("CONFFINALIZADA");
   }

   public void setConfFinalizada(String confFinalizada) {
        markAsChanged("CONFFINALIZADA", confFinalizada);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGWRCON";
   }

   @Override
   public String getEntityName() {
        return "RegistroConferencia";
   }

   @Override
   public RegistroConferencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
