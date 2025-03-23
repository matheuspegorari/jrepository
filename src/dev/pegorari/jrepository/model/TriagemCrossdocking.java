package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TriagemCrossdocking extends AbstractSankhyaEntity<TriagemCrossdocking> {
   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal codUsuConf;
   private String controle;
   private String crossdocking;
   private Timestamp dhAlter;
   private BigDecimal nuRecebimento;
   private BigDecimal qtdTriada;
   private BigDecimal qtdTriadaVolPad;
   private BigDecimal sequencia;

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsuConf() {
        return codUsuConf;
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
        this.codUsuConf = codUsuConf;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getCrossdocking() {
        return crossdocking;
   }

   public void setCrossdocking(String crossdocking) {
        markAsChanged("CROSSDOCKING", crossdocking);
        this.crossdocking = crossdocking;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getQtdTriada() {
        return qtdTriada;
   }

   public void setQtdTriada(BigDecimal qtdTriada) {
        markAsChanged("QTDTRIADA", qtdTriada);
        this.qtdTriada = qtdTriada;
   }

   public BigDecimal getQtdTriadaVolPad() {
        return qtdTriadaVolPad;
   }

   public void setQtdTriadaVolPad(BigDecimal qtdTriadaVolPad) {
        markAsChanged("QTDTRIADAVOLPAD", qtdTriadaVolPad);
        this.qtdTriadaVolPad = qtdTriadaVolPad;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TGWTRCD";
   }

   @Override
   public String getEntityName() {
        return "TriagemCrossdocking";
   }

   @Override
   public TriagemCrossdocking fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.controle = vo.asString("CONTROLE");
        this.crossdocking = vo.asString("CROSSDOCKING");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.qtdTriada = vo.asBigDecimal("QTDTRIADA");
        this.qtdTriadaVolPad = vo.asBigDecimal("QTDTRIADAVOLPAD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
