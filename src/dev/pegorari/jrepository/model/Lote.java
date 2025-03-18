package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lote extends AbstractSankhyaEntity<Lote> {
   private BigDecimal codEmp;
   private BigDecimal codLocal;
   private BigDecimal codProd;
   private String controle;
   private Timestamp data;
   private BigDecimal inteiro;
   private String logico;
   private BigDecimal numero;
   private String texto;
   private String titulo;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getData() {
        return data;
   }

   public void setData(Timestamp data) {
        markAsChanged("DATA", data);
        this.data = data;
   }

   public BigDecimal getInteiro() {
        return inteiro;
   }

   public void setInteiro(BigDecimal inteiro) {
        markAsChanged("INTEIRO", inteiro);
        this.inteiro = inteiro;
   }

   public String getLogico() {
        return logico;
   }

   public void setLogico(String logico) {
        markAsChanged("LOGICO", logico);
        this.logico = logico;
   }

   public BigDecimal getNumero() {
        return numero;
   }

   public void setNumero(BigDecimal numero) {
        markAsChanged("NUMERO", numero);
        this.numero = numero;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
        this.texto = texto;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
        this.titulo = titulo;
   }

   @Override
   public String getTableName() {
        return "TGFLOT";
   }

   @Override
   public String getEntityName() {
        return "Lote";
   }

   @Override
   public Lote fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.data = vo.asTimestamp("DATA");
        this.inteiro = vo.asBigDecimal("INTEIRO");
        this.logico = vo.asString("LOGICO");
        this.numero = vo.asBigDecimal("NUMERO");
        this.texto = vo.asString("TEXTO");
        this.titulo = vo.asString("TITULO");
        return this;
   }
}
