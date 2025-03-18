package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DetalheRetornoMovimentoBco extends AbstractSankhyaEntity<DetalheRetornoMovimentoBco> {
   private BigDecimal codigo;
   private String idLinha;
   private String idValor;
   private String nome;
   private BigDecimal posFim;
   private BigDecimal posIni;
   private BigDecimal qtdDec;
   private BigDecimal sequencia;

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public String getIdLinha() {
        return idLinha;
   }

   public void setIdLinha(String idLinha) {
        markAsChanged("IDLINHA", idLinha);
        this.idLinha = idLinha;
   }

   public String getIdValor() {
        return idValor;
   }

   public void setIdValor(String idValor) {
        markAsChanged("IDVALOR", idValor);
        this.idValor = idValor;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public BigDecimal getPosFim() {
        return posFim;
   }

   public void setPosFim(BigDecimal posFim) {
        markAsChanged("POSFIM", posFim);
        this.posFim = posFim;
   }

   public BigDecimal getPosIni() {
        return posIni;
   }

   public void setPosIni(BigDecimal posIni) {
        markAsChanged("POSINI", posIni);
        this.posIni = posIni;
   }

   public BigDecimal getQtdDec() {
        return qtdDec;
   }

   public void setQtdDec(BigDecimal qtdDec) {
        markAsChanged("QTDDEC", qtdDec);
        this.qtdDec = qtdDec;
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
        return "TSIIRT";
   }

   @Override
   public String getEntityName() {
        return "DetalheRetornoMovimentoBco";
   }

   @Override
   public DetalheRetornoMovimentoBco fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codigo = vo.asBigDecimal("CODIGO");
        this.idLinha = vo.asString("IDLINHA");
        this.idValor = vo.asString("IDVALOR");
        this.nome = vo.asString("NOME");
        this.posFim = vo.asBigDecimal("POSFIM");
        this.posIni = vo.asBigDecimal("POSINI");
        this.qtdDec = vo.asBigDecimal("QTDDEC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
