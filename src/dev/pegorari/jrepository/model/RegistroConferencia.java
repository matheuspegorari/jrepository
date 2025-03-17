package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroConferencia implements SankhyaEntity<RegistroConferencia> {

   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal codUsuConf;
   private String controle;
   private Timestamp dhFim;
   private Timestamp dhIni;
   private String fechado;
   private BigDecimal nuRecebimento;
   private BigDecimal nuTarefa;
   private BigDecimal qtdAvariaVolPad;
   private BigDecimal qtdRecebidaVolPad;
   private String recontagem;
   private String uma;
   private String confFinalizada;
   private Timestamp dtVal;
   private BigDecimal sequencia;

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsuConf() {
        return codUsuConf;
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        this.codUsuConf = codUsuConf;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDhFim() {
        return dhFim;
   }

   public void setDhFim(Timestamp dhFim) {
        this.dhFim = dhFim;
   }

   public Timestamp getDhIni() {
        return dhIni;
   }

   public void setDhIni(Timestamp dhIni) {
        this.dhIni = dhIni;
   }

   public String getFechado() {
        return fechado;
   }

   public void setFechado(String fechado) {
        this.fechado = fechado;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getQtdAvariaVolPad() {
        return qtdAvariaVolPad;
   }

   public void setQtdAvariaVolPad(BigDecimal qtdAvariaVolPad) {
        this.qtdAvariaVolPad = qtdAvariaVolPad;
   }

   public BigDecimal getQtdRecebidaVolPad() {
        return qtdRecebidaVolPad;
   }

   public void setQtdRecebidaVolPad(BigDecimal qtdRecebidaVolPad) {
        this.qtdRecebidaVolPad = qtdRecebidaVolPad;
   }

   public String getRecontagem() {
        return recontagem;
   }

   public void setRecontagem(String recontagem) {
        this.recontagem = recontagem;
   }

   public String getUma() {
        return uma;
   }

   public void setUma(String uma) {
        this.uma = uma;
   }

   public String getConfFinalizada() {
        return confFinalizada;
   }

   public void setConfFinalizada(String confFinalizada) {
        this.confFinalizada = confFinalizada;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "RegistroConferencia";
   }

   @Override
   public RegistroConferencia fromVO(DynamicVO vo) {
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.controle = vo.asString("CONTROLE");
        this.dhFim = vo.asTimestamp("DHFIM");
        this.dhIni = vo.asTimestamp("DHINI");
        this.fechado = vo.asString("FECHADO");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.qtdAvariaVolPad = vo.asBigDecimal("QTDAVARIAVOLPAD");
        this.qtdRecebidaVolPad = vo.asBigDecimal("QTDRECEBIDAVOLPAD");
        this.recontagem = vo.asString("RECONTAGEM");
        this.uma = vo.asString("UMA");
        this.confFinalizada = vo.asString("CONFFINALIZADA");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
