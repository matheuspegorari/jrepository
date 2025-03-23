package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemConferidoColetor extends AbstractSankhyaEntity<ItemConferidoColetor> {
   private Timestamp dtVal;
   private BigDecimal nuConferencia;
   private BigDecimal numVol;
   private BigDecimal qtdAvaria;
   private BigDecimal quantidade;
   private BigDecimal sequencia;
   private String codBarra;
   private BigDecimal codUsu;
   private String controle;
   private String confUsuFinal;
   private BigDecimal qtdPecas;
   private String seriesNcm;
   private String tipoLeitura;

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
        this.nuConferencia = nuConferencia;
   }

   public BigDecimal getNumVol() {
        return numVol;
   }

   public void setNumVol(BigDecimal numVol) {
        markAsChanged("NUMVOL", numVol);
        this.numVol = numVol;
   }

   public BigDecimal getQtdAvaria() {
        return qtdAvaria;
   }

   public void setQtdAvaria(BigDecimal qtdAvaria) {
        markAsChanged("QTDAVARIA", qtdAvaria);
        this.qtdAvaria = qtdAvaria;
   }

   public BigDecimal getQuantidade() {
        return quantidade;
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
        this.quantidade = quantidade;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getConfUsuFinal() {
        return confUsuFinal;
   }

   public void setConfUsuFinal(String confUsuFinal) {
        markAsChanged("CONFUSUFINAL", confUsuFinal);
        this.confUsuFinal = confUsuFinal;
   }

   public BigDecimal getQtdPecas() {
        return qtdPecas;
   }

   public void setQtdPecas(BigDecimal qtdPecas) {
        markAsChanged("QTDPECAS", qtdPecas);
        this.qtdPecas = qtdPecas;
   }

   public String getSeriesNcm() {
        return seriesNcm;
   }

   public void setSeriesNcm(String seriesNcm) {
        markAsChanged("SERIESNCM", seriesNcm);
        this.seriesNcm = seriesNcm;
   }

   public String getTipoLeitura() {
        return tipoLeitura;
   }

   public void setTipoLeitura(String tipoLeitura) {
        markAsChanged("TIPO_LEITURA", tipoLeitura);
        this.tipoLeitura = tipoLeitura;
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
        this.dtVal = vo.asTimestamp("DTVAL");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.numVol = vo.asBigDecimal("NUMVOL");
        this.qtdAvaria = vo.asBigDecimal("QTDAVARIA");
        this.quantidade = vo.asBigDecimal("QUANTIDADE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codBarra = vo.asString("CODBARRA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.controle = vo.asString("CONTROLE");
        this.confUsuFinal = vo.asString("CONFUSUFINAL");
        this.qtdPecas = vo.asBigDecimal("QTDPECAS");
        this.seriesNcm = vo.asString("SERIESNCM");
        this.tipoLeitura = vo.asString("TIPO_LEITURA");
        return this;
   }
}
