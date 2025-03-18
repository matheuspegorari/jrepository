package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Impressora extends AbstractSankhyaEntity<Impressora> {
   private String aliasLocal;
   private String ativo;
   private Timestamp dhStatus;
   private String nome;
   private BigDecimal nuPrinter;
   private BigDecimal nuSvp;
   private String printerUri;
   private String status;

   public String getAliasLocal() {
        return aliasLocal;
   }

   public void setAliasLocal(String aliasLocal) {
        markAsChanged("ALIASLOCAL", aliasLocal);
        this.aliasLocal = aliasLocal;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public Timestamp getDhStatus() {
        return dhStatus;
   }

   public void setDhStatus(Timestamp dhStatus) {
        markAsChanged("DHSTATUS", dhStatus);
        this.dhStatus = dhStatus;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public BigDecimal getNuPrinter() {
        return nuPrinter;
   }

   public void setNuPrinter(BigDecimal nuPrinter) {
        markAsChanged("NUPRINTER", nuPrinter);
        this.nuPrinter = nuPrinter;
   }

   public BigDecimal getNuSvp() {
        return nuSvp;
   }

   public void setNuSvp(BigDecimal nuSvp) {
        markAsChanged("NUSVP", nuSvp);
        this.nuSvp = nuSvp;
   }

   public String getPrinterUri() {
        return printerUri;
   }

   public void setPrinterUri(String printerUri) {
        markAsChanged("PRINTERURI", printerUri);
        this.printerUri = printerUri;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   @Override
   public String getTableName() {
        return "TSIPRN";
   }

   @Override
   public String getEntityName() {
        return "Impressora";
   }

   @Override
   public Impressora fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aliasLocal = vo.asString("ALIASLOCAL");
        this.ativo = vo.asString("ATIVO");
        this.dhStatus = vo.asTimestamp("DHSTATUS");
        this.nome = vo.asString("NOME");
        this.nuPrinter = vo.asBigDecimal("NUPRINTER");
        this.nuSvp = vo.asBigDecimal("NUSVP");
        this.printerUri = vo.asString("PRINTERURI");
        this.status = vo.asString("STATUS");
        return this;
   }
}
