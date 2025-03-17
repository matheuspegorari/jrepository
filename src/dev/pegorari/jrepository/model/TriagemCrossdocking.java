package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TriagemCrossdocking implements SankhyaEntity<TriagemCrossdocking> {

   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal codUsuConf;
   private String controle;
   private String crossDocking;
   private Timestamp dhAlter;
   private BigDecimal nuRecebimento;
   private BigDecimal qtdTriada;
   private BigDecimal qtdTriadaVolPad;
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

   public String getCrossDocking() {
        return crossDocking;
   }

   public void setCrossDocking(String crossDocking) {
        this.crossDocking = crossDocking;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getQtdTriada() {
        return qtdTriada;
   }

   public void setQtdTriada(BigDecimal qtdTriada) {
        this.qtdTriada = qtdTriada;
   }

   public BigDecimal getQtdTriadaVolPad() {
        return qtdTriadaVolPad;
   }

   public void setQtdTriadaVolPad(BigDecimal qtdTriadaVolPad) {
        this.qtdTriadaVolPad = qtdTriadaVolPad;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "TriagemCrossdocking";
   }

   @Override
   public TriagemCrossdocking fromVO(DynamicVO vo) {
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.controle = vo.asString("CONTROLE");
        this.crossDocking = vo.asString("CROSSDOCKING");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.qtdTriada = vo.asBigDecimal("QTDTRIADA");
        this.qtdTriadaVolPad = vo.asBigDecimal("QTDTRIADAVOLPAD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
